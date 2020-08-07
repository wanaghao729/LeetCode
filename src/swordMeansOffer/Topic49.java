package src.swordMeansOffer;

public class Topic49 {
    public int nthUglyNumber(int n) {
        int a = 0, b = 0, c = 0;
        // dp[i]代表第i+1个丑数
        int[] dp = new int[n];
        dp[0] = 1;
        for (int i = 1; i < n; i++) {
            int n2 = dp[a] * 2, n3 = dp[b] * 3, n5 = dp[c] * 5;
            dp[i] = Math.min(Math.min(n2, n3), n5);
            if (dp[i] == n2)    a++;
            if (dp[i] == n3)    b++;
            if (dp[i] == n5)    c++;
        }
        return dp[n - 1];
    }
}
