package src.swordMeansOffer;

/**
 * 57、已排序的和为s的两个数
 */
public class Topic57 {
    public int[] twoSum(int[] nums, int target) {
        if (nums == null || nums.length == 0)   return new int[]{};
        int left = 0, right = nums.length - 1;
        while (left <= right) {
            int sum = nums[left] + nums[right];
            if (sum > target)
                right--;
            else if (sum < target)
                left++;
            else
                break;
        }
        return new int[]{nums[left], nums[right]};
    }
}
