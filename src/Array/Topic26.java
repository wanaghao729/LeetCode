package src.Array;

/**
 * 26、从有序序列移除重复值，返回最终的数组长度，不允许申请多于的内存空间
 *n = [1,1,2] ==> [1,2] 长度为2
 *n = [0,0,1,1,1,2,2,3,3,4] ==> [0,1,2,3,4] 长度为5
 */
public class Topic26 {
    public int removeDuplicates(int[] nums) {
        if (nums==null || nums.length==0) return 0;
        if (nums.length < 2) return 1;
        int count = 0;
        int number = nums[0];
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] == nums[i-1])
                continue;
            else
                count++;
        }
        return count;
    }


    public static void main(String[] args) {
        int[] nums = {0,0,1,1,1,2,2,3,3,4};
        System.out.println(new Topic26().removeDuplicates(nums));
    }
}
