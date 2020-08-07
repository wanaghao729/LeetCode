package src.swordMeansOffer;

import java.util.PriorityQueue;

public class MedianFinder {
    private PriorityQueue<Integer> lowPart;
    private PriorityQueue<Integer> highPart;
    private int size = 0;
    public MedianFinder() {
        // 大顶堆
        lowPart = new PriorityQueue<>((x, y) -> y - x);
        // 小顶堆
        highPart = new PriorityQueue<>();
    }

    public void addNum(int num) {
        size++;
        lowPart.offer(num);
        highPart.offer(lowPart.poll());
        if ((size & 1) == 1) {
            lowPart.offer(highPart.poll());
        }
    }

    public double findMedian() {
        if ((size & 1) == 1) {
            return (double)lowPart.peek();
        } else {
            return (double)(lowPart.peek() + highPart.peek()) / 2;
        }
    }
}
