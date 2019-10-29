package src.Array;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

/**
 * 15. 3Sum
 * Given an array nums of n integers, are there elements a, b, c in nums such that a + b + c = 0? Find all unique triplets in the array which gives the sum of zero.
 *
 * Note:
 *
 * The solution set must not contain duplicate triplets.
 *
 * Example:
 *
 * Given array nums = [-1, 0, 1, 2, -1, -4],
 *
 * A solution set is:
 * [
 *   [-1, 0, 1],
 *   [-1, -1, 2]
 * ]
 */
public class Topic15 {
    //思路就是固定一个值，对另两个值在数组(有序)两端进行排序
    public List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> res = new LinkedList<>();
        //数组只有三个值nums.length-2
        for (int i = 0; i < nums.length-2; i++) {
            //前后两值一样得出的结果会是相同的，防止这种状况
            if (i == 0 || nums[i] != nums[i - 1]) {
                int low = i + 1;
                int high = nums.length - 1;
                int sum = 0 - nums[i];
                while (low < high) {
                    if (nums[low] + nums[high] == sum) {
                        res.add(Arrays.asList(nums[i], nums[low], nums[high]));
                        while (low < high && nums[low] == nums[low+1])    low++;
                        while (low < high && nums[high] == nums[low-1])    high--;
                        low++;
                        high--;
                    } else if (nums[low] + nums[high] < sum) {
                        //跳过重复值,下同
                        while (low < high && nums[low] == nums[low+1])  low++;
                        low++;
                    } else {
                        while (low < high && nums[high] == nums[high-1])  high--;
                        high--;
                    }
                }
            }
        }
        return res;
    }
}
