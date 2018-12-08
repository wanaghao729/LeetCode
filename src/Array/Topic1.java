package Array;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 * 题目描述与167类似，只不过输入数组未指名有序
 */
public class Topic1 {

    public int[] twoSum(int[] nums, int target) {
        int[] result = new int[2];
        if (nums == null || nums.length < 2)
            return result;
        int N = nums.length;
        Map<Integer, Integer> map = new HashMap<>(N << 1);
        for (int i = 0; i < N; i++) {
            if (map.containsKey(nums[i])) {
                result[1] = i;
                result[0] = map.get(nums[i]);
                return result;
            }
            map.put(target - nums[i], i);
        }
        return result;
    }

    public static void main(String[] args) {
        int[] A = {2, 7, 11, 15};
        System.out.println(Arrays.toString(new Topic1().twoSum(A, 9)));
    }
}
