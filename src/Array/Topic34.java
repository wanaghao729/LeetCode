package src.Array;

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
