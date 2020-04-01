package src.leetcode_cn;

/**
 * 排序问题
 */
public class Topic912 {
    // 交换函数
    private void swap(int[] arr, int index1, int index2) {
        int tmp = arr[index1];
        arr[index2] = arr[index1];
        arr[index1] = tmp;
    }

    // 计数排序
    public int[] sortArray(int[] nums) {
        int max = nums[0], min = nums[0];
        for (int num : nums) {
            max = Math.max(max, num);
            min = Math.min(min, num);
        }

        int[] count = new int[max - min + 1];
        for (int num : nums) {
            count[num-min]++;
        }
        int idx = 0;
        for (int num = min; num <= max; num++) {
            int cnt = count[num - min];
            while (cnt-- > 0)
                nums[idx++] = num;
        }
        return nums;
    }

    // 快排
    public int[] sortArray0(int[] nums) {
        quickSortRecursive(nums, 0, nums.length - 1);
        return nums;
    }

    private void quickSortRecursive(int[] nums, int start, int end) {
        if (start > end)    return;
        int mid = nums[end];
        int left = start, right = end - 1;

        while (left < right) {
            while (nums[left] < mid && left < right)
                left++;

            while (nums[right] >= mid && left < right)
                right--;
            swap(nums, left, right);
        }

        if (nums[left] >= nums[end])
            swap(nums, left, end);
        else {
            left++;
            swap(nums, left, end);
        }

        if (left > 0)
            quickSortRecursive(nums, start, left - 1);
        quickSortRecursive(nums, left, end);
    }
}
