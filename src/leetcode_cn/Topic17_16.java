package src.leetcode_cn;

/**
 * 按摩师
 */
public class Topic17_16 {
    public int massage(int[] nums) {
        int n = nums.length;
        if (n == 0) return 0;
        if (n == 1) return nums[0];

        int[] dp = new int[n];
        dp[0] = nums[0];
        dp[1] = Math.max(nums[0], nums[1]);
        for (int i = 2; i < nums.length; i++) {
            dp[i] = Math.max(dp[i - 1], dp[i - 2] + nums[i]);
        }
        return dp[n - 1];
    }


    public int message1(int[] nums) {
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
