package src.getoffer;

/**
 * 时间复杂度为O(nlogn),空间复杂度为O(1)
 */
public class Topic2_41 {
    int getDumplication(int[] nums) {
        int dumplicate_num = -1;
        if (nums==null || nums.length<0)
            return dumplicate_num;
        int start = 1;
        int end = nums.length - 1;
        while (start <= end) {
            int middle = ((end - start) >> 1) + start;
            int count = countRange(nums, start, middle);
            if (end == start) {
                if (count > 1)
                    return start;
                else
                    break;
            }
            if (count > (middle - start + 1))
                end = middle;
            else
                start = middle + 1;

        }
        return dumplicate_num;
    }

    int countRange(int[] nums, int start, int end) {
        if (nums == null)
            return -1;
        int count = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] >= start && nums[i] <= end)
                ++count;
        }
        return count;
    }

    public static void main(String[] args) {
        int[] test = {2, 3, 5, 4, 1, 2};
        System.out.println(new Topic2_41().getDumplication(test));
    }
}
