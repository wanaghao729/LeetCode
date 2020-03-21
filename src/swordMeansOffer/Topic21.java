package src.swordMeansOffer;

/**
 * 奇偶排序
 */
public class Topic21 {

    // 交换函数
    public void swap(int[] arr, int index1, int index2) {
        if (index1 * index1 < 0 || index1 >= arr.length || index2 >= arr.length)
            throw new ArrayIndexOutOfBoundsException("超过交换边界");
        int tmp = arr[index1];
        arr[index1] = arr[index2];
        arr[index2] = tmp;
    }


    public int[] exchange(int[] nums) {
        if (nums == null || nums.length == 0)   return nums;
        int left = 0;
        int right = nums.length - 1;
        while (left < right) {
            while (left < right && nums[left] % 2 != 0)
                left++;
            while (left < right && nums[right] % 2 == 0)
                right--;
            swap(nums, left, right);
        }
        return nums;
    }
}
