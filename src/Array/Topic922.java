package Array;

import java.util.Arrays;

/**
 * 题型与905类似
 * 给定非负整型数组A,对A进行特定排序,使A符合
 *        |- 奇数 i % 2 == 1
 * A[i] = |
 *        |- 偶数 i % 2 == 0
 */
public class Topic922 {
    public int[] sortArrayByParityII(int[] A) {
        int N = A.length;
        int j = 1;
        for (int i = 0; i < N; i += 2) {
            if (A[i] % 2 != 0) {
                while (A[j] % 2 == 1 && j < N) {
                    j += 2;
                }
                int tmp = A[i];
                A[i] = A[j];
                A[j] = tmp;
            }
        }
        return A;
    }

    public static void main(String[] args) {
        int[] A = {4,2,5,7};
        System.out.println(Arrays.toString(new Topic922().sortArrayByParityII(A)));
    }
}
