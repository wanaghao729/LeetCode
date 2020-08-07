package src.Array;

/**
 * 难度:easy(Are you sure??!!)
 * 给定一个整数数组，找出一个连续子序列，当你以升序方式排好这个子序列时，
 * 整个数组都以升序方式排列，输出这个这样的最短的连续子序列的长度
 * 例如[2, 6, 4, 8, 10, 9, 15]
 * 其满足要求的最短子序列是[6, 4, 8, 10, 9]，当你以升序排列好这个序列时，
 * 整个整数序列都将是升序的
 */
public class Topic581 {
    public int findUnsortedSubarray(int[] A) {
        int n = A.length, beg = -1, end = -2, min = A[n-1], max = A[0];
        for (int i=1;i<n;i++) {
            max = Math.max(max, A[i]);
            min = Math.min(min, A[n-1-i]);
            if (A[i] < max) end = i;
            if (A[n-1-i] > min) beg = n-1-i;
        }
        return end - beg + 1;
    }
}
