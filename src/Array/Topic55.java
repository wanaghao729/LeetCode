package src.Array;

public class Topic55 {
    public boolean canJump(int[] nums) {
        int n = nums.length;
        if (nums == null || n == 0) return false;
        if (n == 1) return true;
        int last = n - 1;
        for (int i = n - 2; i >= 0; i--) {
            if (i + nums[i] >= last)
                last = i;
        }
        return last <= 0;
    }
}
