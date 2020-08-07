package src.swordMeansOffer;

/**
 *  在排序数组中查找数字 I的次数
 */
public class Topic53_1 {
    public int search(int[] nums, int target) {
        int result1 = binarySearch(nums, target, 0, nums.length - 1);
        if (result1 == -1)  return 0;
        int result2 = result1;
        int left = result1, right = result2;
        while (result1 != -1) {
            left = result1;
            result1 = binarySearch(nums, target, 0, result1 - 1);
        }

        while (result2 != -1) {
            right = result2;
            result2 = binarySearch(nums, target, result2 + 1, nums.length - 1);
        }

        return right - left + 1;
    }

    private int binarySearch(int[] nums, int target, int start, int end) {
        int result = -1;
        if (start > end)    return result;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (target > nums[mid])
                start = mid + 1;
            else if (target < nums[mid])
                end = mid - 1;
            else {
                result = mid;
                break;
            }
        }
        return result;
    }
}
