package src.swordMeansOffer;

import java.util.ArrayList;
import java.util.List;

/**
 * 和为s的连续整数序列
 */
public class Topic57_2 {
    public int[][] findContinuousSequence(int target) {
        int left = 1;
        int right = 1;
        int sum = 0;

        List<int[]> result = new ArrayList<>();

        while (left <= target / 2) {
            if (sum < target){
                sum += right;
                right++;
            } else if (sum > target) {
                sum -= left;
                left++;
            } else {
                int[] arr = new int[right - left];
                for (int i = left; i < right; i++)
                    arr[i - left] = i;
                result.add(arr);

                sum -= left;
                left++;
            }
        }
        return result.toArray(new int[result.size()][]);
    }
}
