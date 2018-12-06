package Array;

/**
 * 给定整型数组A,判定A是否有如下特性
 * A[0]<A[1]<A[2]<...<A[i-1]<A[i]
 * A[i]>A[i+1]>...>A[length-2]>A[length-1]
 * [3,5,5] false
 * [0,3,2,1] true
 */
public class Topic941 {

    public boolean validMountainArray(int[] A) {
        int N = A.length;
        int i = 0;
        //上山
        while (i+1 < N && A[i] < A[i+1]) {
            i++;
        }

        if (i==0 || i==N-1) {
            return false;
        }

        //下山
        while (i+1 < N && A[i] > A[i+1]) {
            i++;
        }

        return i == N-1;
    }

    public static void main(String[] args) {
        int[] a = {0, 3, 2, 1};
        System.out.println(new Topic941().validMountainArray(a));
    }
}
