package src.Array;

import org.omg.PortableInterceptor.INACTIVE;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 46. Permutations Medium
 Example:
 Input: [1,2,3]
 Output:
 [
 [1,2,3],
 [1,3,2],
 [2,1,3],
 [2,3,1],
 [3,1,2],
 [3,2,1]
 ]
 * https://leetcode.com/problems/permutations/discuss/18239/A-general-approach-to-backtracking-questions-in-Java-(Subsets-Permutations-Combination-Sum-Palindrome-Partioning)
 * 其中有相似题型 46 49 78 90
 */
public class Topic46 {
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> list = new ArrayList<>();
//        Arrays.sort(nums); not necessary
        backtrack(list, new ArrayList<>(), nums);
        return list;
    }

    private void backtrack(List<List<Integer>> list, List<Integer> templist, int[] nums) {
        if (templist.size() == nums.length)
            list.add(new ArrayList<>(templist));
        else {
            for (int i = 0; i < nums.length; i++) {
                if (templist.contains(nums[i])) continue; // element already exists, skip
                templist.add(nums[i]);
                backtrack(list, templist, nums);
                templist.remove(templist.size() - 1);
            }
        }
    }
}
