package src.Array;

/**
 * 70. Climbing Stairs
 * You are climbing a stair case. It takes n steps to reach to the top.
 *
 * Each time you can either climb 1 or 2 steps. In how many distinct ways can you climb to the top?
 *
 * Note: Given n will be a positive integer.
 *
 * Example 1:
 *
 * Input: 2
 * Output: 2
 * Explanation: There are two ways to climb to the top.
 * 1. 1 step + 1 step
 * 2. 2 steps
 * Example 2:
 *
 * Input: 3
 * Output: 3
 * Explanation: There are three ways to climb to the top.
 * 1. 1 step + 1 step + 1 step
 * 2. 1 step + 2 steps
 * 3. 2 steps + 1 step
 * Similar Question: 62 70 91 509
 */
public class Topic70 {
    public int climbStairs(int n) {
        if (n == 1) return 1;
        if (n == 2) return 2;
        int[] cur = new int[n];
        cur[0] = 1;
        cur[1] = 2;
        for (int i = 2; i < n; i++)
            cur[i] = cur[i-1] + cur[i-2];
        return cur[n-1];
    }

    public static void main(String[] args) {
        System.out.println(new Topic70().climbStairs(4));
    }
}
