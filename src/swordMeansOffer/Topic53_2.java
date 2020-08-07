package src.swordMeansOffer;

/**
 * 0 ~ n-1中缺失的数字
 */
public class Topic53_2 {
    public int missingNumber(int[] nums) {
        int start = 0, end = nums.length - 1;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (nums[mid] == mid)
                start = mid + 1;
            else
                end = mid - 1;
        }
        return start;
    }
}
