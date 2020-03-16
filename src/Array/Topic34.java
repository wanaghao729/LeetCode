package src.Array;

/**
 * 34. Find First and Last Position of Element in Sorted Array
 * Given an array of integers nums sorted in ascending order, find the starting and ending position of a given target value.
 *
 * Your algorithm's runtime complexity must be in the order of O(log n).
 *
 * If the target is not found in the array, return [-1, -1].
 *
 * Example 1:
 *
 * Input: nums = [5,7,7,8,8,10], target = 8
 * Output: [3,4]
 * Example 2:
 *
 * Input: nums = [5,7,7,8,8,10], target = 6
 * Output: [-1,-1]
 */
public class Topic34 {
    public int[] searchRange(int[] nums, int target) {
        int[] position = new int[]{-1, -1};
        if (nums == null || nums.length == 0)   return position;
        int leftIndex = extremeInsertionIndex(nums, target, true);
        if (leftIndex == nums.length || nums[leftIndex] != target)
            return position;
        position[0] = leftIndex;
        position[1] = extremeInsertionIndex(nums, target, false) - 1;
        return position;
    }

    public int extremeInsertionIndex(int[] nums, int target, boolean left) {
        int lo = 0;
        int high = nums.length;
        while (lo < high) {
            int mid = (lo + high) >> 1;
            if (nums[mid] > target || (left && nums[mid] == target))
                high = mid;
            else
                lo = mid + 1;
        }
        return lo;
    }
}
