package src.Array;

import java.util.Arrays;
import java.util.Comparator;

/**
 * 435. Non-overlapping Intervals
 * Given a collection of intervals, find the minimum number of intervals you need to remove to make the rest of the intervals non-overlapping.
 *
 *
 *
 * Example 1:
 *
 * Input: [[1,2],[2,3],[3,4],[1,3]]
 * Output: 1
 * Explanation: [1,3] can be removed and the rest of intervals are non-overlapping.
 * Example 2:
 *
 * Input: [[1,2],[1,2],[1,2]]
 * Output: 2
 * Explanation: You need to remove two [1,2] to make the rest of intervals non-overlapping.
 * Example 3:
 *
 * Input: [[1,2],[2,3]]
 * Output: 0
 * Explanation: You don't need to remove any of the intervals since they're already non-overlapping.
 *
 *
 * Note:
 *
 * You may assume the interval's end point is always bigger than its start point.
 * Intervals like [1,2] and [2,3] have borders "touching" but they don't overlap each other.
 */
public class Topic435 {
    public int eraseOverlapIntervals(int[][] intervals) {
        if (intervals == null || intervals.length <= 1) return 0;
        Arrays.sort(intervals, (v1, v2) -> Integer.compare(v1[1], v2[1]));
        int end = intervals[0][1];
        int count = 1;

        for (int[] interval : intervals) {
            if (interval[0] >= end) {
                end = interval[1];
                count++;
            }
        }
        return intervals.length - count;
    }

    public static void main(String[] args) {

        Topic435 t = new Topic435();
        System.out.println(t.eraseOverlapIntervals(new int[][]{{1, 2}, {2, 3}, {1, 2}}));
        System.out.println(new int[][]{{1, 2}, {2, 3}, {1, 2}}.length);
    }
}
