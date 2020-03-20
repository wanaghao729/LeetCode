package src.leetcode_cn;

import java.util.PriorityQueue;
import java.util.Queue;

/**
 * Top k
 */
public class Topic40 {
    // 交换函数
    public void swap(int[] arr, int index1, int index2) {
        if (index1 * index1 < 0 || index1 >= arr.length || index2 >= arr.length)
            throw new ArrayIndexOutOfBoundsException("超过交换边界");
        int tmp = arr[index1];
        arr[index1] = arr[index2];
        arr[index2] = tmp;
    }

    // 最大堆调整
    public void maxHeapify(int[] arr, int start, int end) {
        int dad = start;
        int son = dad * 2 + 1;
        while (son <= end) {
            if (son + 1 < end && arr[son] < arr[son + 1])
                son++;
            if (dad > son)
                return;
            else {
                swap(arr, dad, son);
                dad = son;
                son = dad * 2 + 1;
            }

        }
    }
    public int[] getLeastNumbers1(int[] arr, int k) {
        if (k == 0) return new int[0];
        int i;
        for (i = arr.length / 2 - 1; i >= 0; i--) {
            maxHeapify(arr, i, arr.length - 1);
        }
        int l = arr.length - k;
        for (i = arr.length; i >= l; i--) {

        }
        return null;
    }
    public int[] getLeastNumbers(int[] arr, int k) {
        if (k == 0)    return new int[0];
        Queue<Integer> heap = new PriorityQueue<>(k, (i1, i2) -> Integer.compare(i2, i1));
        for (int e : arr) {
            if (heap.isEmpty() || heap.size() < k || e < heap.peek())
                heap.offer(e);
            if (heap.size() > k)
                heap.poll();
        }

        int[] res = new int[heap.size()];
        int j = 0;
        for (int e : heap) {
            res[j++] = e;
        }
        return res;
    }

    public int[] getLeastNumbers2(int[] arr, int k) {
        if (k == 0)    return new int[0];
        Queue<Integer> heap = new PriorityQueue<>(k, (i1, i2) -> Integer.compare(i2, i1));
        for (int e : arr) {
            if (heap.isEmpty() || heap.size() < k || e < heap.peek())
                heap.offer(e);
            if (heap.size() > k)
                heap.poll();
        }

        int[] res = new int[heap.size()];
        int j = 0;
        for (int e : heap) {
            res[j++] = e;
        }
        return res;
    }

    public void quickSortRecursive(int[] arr, int start, int end) {
        if (start >= end)
            return;

        int mid = arr[end];
        int left = start, right = end - 1;
        while (left < right) {
            while (left < right && arr[left] < mid)
                left++;
            while (left < right && arr[right] > mid)
                right++;
            swap(arr, left, right);
        }
        //找到mid的位置
        if (arr[left] > arr[end])
            swap(arr, left, end);
        else {
            left++;
            swap(arr, left, end);
        }

        if (left > 0)
            quickSortRecursive(arr, start, left - 1);
        quickSortRecursive(arr, left, end);
    }


}
