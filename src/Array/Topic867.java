package Array;

import java.util.Arrays;

/**
 * 逆转矩阵，给定矩阵A，求AT
 */
public class Topic867 {
    public int[][] transpose(int[][] A) {
        int R = A.length;
        int C = A[0].length;
        int[][] ans = new int[C][R];
        for (int r = 0; r < R; r++) {
            for (int c = 0; c < C; c++) {
                ans[r][c] = A[c][r];
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        int[][] A = new int[][]{{1, 2},{3, 4}};
        System.out.println(Arrays.toString(new Topic867().transpose(A)[0]));
        System.out.println(Arrays.toString(new Topic867().transpose(A)[1]));
    }
}
