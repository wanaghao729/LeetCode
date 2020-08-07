package src.leetcode_cn;

/**
 * 爬楼梯
 */
public class Topic70 {
    public int climbStairs(int n) {
        int res = 0;
        int a = 0;
        int b = 1;
        for (int i = 0; i < n; i++) {
            res = a + b;
            a = b;
            b = res;
        }
        return res;
    }
}
