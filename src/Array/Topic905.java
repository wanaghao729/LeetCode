package Array;


import java.util.Arrays;

/**
 * 给定非负整型数组A,对A进行特定排序,使A符合
 * A[0]A[1]...A[i-1]A[i]为偶数
 * A[i+1]A[i+2]...A[A.length-2]A[A.length-1]为奇数
 * 输入[3,1,2,4]
 * 输出[4,2,3,1], [2,4,1,3], [4,2,1,3]皆可
 */
public class Topic905 {
    public int[] sortArrayByParity(int[] A) {
        for (int i = 0,j = 0; j < A.length; j++) {
            if (A[j] % 2 == 0) {
                int tmp = A[i];
                A[i++] = A[j];
                A[j] = tmp;
            }
        }
        return A;
    }
    public int[] sortArrayByParity0(int[] A) {
        int i = 0, j = A.length - 1;
        while (i < j) {
            if (A[i] % 2 > A[j] % 2) {
                int tmp = A[i];
                A[i] = A[j];
                A[j] = tmp;
            }
            if (A[i] % 2 == 0) i++;
            if (A[j] % 2 == 1) j--;
        }
        return A;
    }
    public static void main(String[] args) {
        System.out.println(3 % 2 == 1);
        int[] B = new int[]{3,1,2,4};
        int[] A = new Topic905().sortArrayByParity(B);
        System.out.println(Arrays.toString(A));
    }
}
