package src.leetcode_cn;

public class Topic_34 {
    public int[] searchRange(int[] nums, int target) {
        int result1 = binarySearch(nums, target, 0, nums.length - 1);
        if (result1 == -1)  return new int[]{-1, -1};
        int result2 = result1, left = result1, right = result1;
        while (result1 != -1) {
            left = result1;
            result1 = binarySearch(nums, target, 0, result1 - 1);
        }

        while (result2 != -1) {
            right = result2;
            result2 = binarySearch(nums, target, result2 + 1, nums.length - 1);
        }

        return new int[]{left, right};
    }

    private int binarySearch(int[] nums, int target, int start, int end) {
        int result = -1;
        if (start > end)    return result;
        while (start <= end) {
            int mid = start + (end  - start) / 2;
            if (target < nums[mid])
                end = mid - 1;
            else if (target > nums[mid])
                start = mid + 1;
            else {
                result = mid;
                break;
            }
        }
        return result;
    }

    public static void main(String[] args) {
        int[] nums = new int[]{5,7,7,8,8,10};
        System.out.println(new Topic_34().searchRange(nums, 8).toString());
    }
}
