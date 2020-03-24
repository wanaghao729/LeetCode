package src.leetcode_cn;

/**
 * 盗窃最大金额
 */
public class Topic198 {
    public int rob(int[] nums) {
        int n = nums.length;
        int a = 0, b = 0;
        for (int i = 0; i < n; i++) {
            int c = Math.max(b, a + nums[i]);
            a = b;
            b = c;
        }
        return b;
    }
}
