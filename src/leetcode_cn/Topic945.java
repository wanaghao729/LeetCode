package src.leetcode_cn;

import java.util.Arrays;

/**
 * 945. 使数组唯一的最小增量
 */
public class Topic945 {
    //1、排序法
    public int minIncrementForUnique1(int[] A) {
        if (A == null || A.length == 0) return 0;

        //先排序
        Arrays.sort(A);

        // 如果当前值小于等于前一个元素，变成前一个数加1
        int move = 0;
        for (int i = 1; i < A.length; i++) {
            if (A[i] <= A[i - 1]) {
                int pre = A[i];
                A[i] = A[i - 1] + 1;
                move += A[i] - pre;
            }
        }

        return move;
    }
    // 2、线性探测--这道题的本质是一个数hash到数组上，采用线性探测，会探测多少次
    int[] pos = new int[80000]; // 都是40000映射
    public int minIncrementForUnique(int[] A) {
        Arrays.fill(pos, -1); //-1表空位
        int move = 0;
        // 遍历a找到映射的位置b，其间的增量就是操作数
        for (int a : A) {
            int b = findPosi(a);
            move += b - a;
        }
        return move;
    }

    private int findPosi(int a) {
        int b = pos[a];
        // 映射成功，直接放入a
        if (b == -1) {
            pos[a] = a;
            return a;
        }

        //否则线性探测向后寻址
        //因为我们使用了状态压缩，所以pos[a]存储的就是上次寻址得到的空位，因此从pos[a]+1开始就行了，不需要从a+1开始
        b = findPosi(b+1);
        pos[a] = b; //路径压缩，找到的新位置重新赋给a位置
        return b;
    }
}
