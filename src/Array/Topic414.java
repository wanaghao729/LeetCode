package Array;

/**
 * 给定一个非空整形数组，找出排名第三大的数字
 */
public class Topic414 {
    //最快的写法为thirdMax1
    //O(n),但这个写法是最慢的，应该是int的装箱操作花费了大量时间
    public int thirdMax(int[] nums) {
        Integer max1 = null;
        Integer max2 = null;
        Integer max3 = null;
        for (Integer n : nums) {
            if (n.equals(max1) || n.equals(max2) || n.equals(max3)) continue;
            if (max1 == null || n > max1) {
                max3 = max2;
                max2 = max1;
                max1 = n;
            }else if (max2 == null || n > max2) {
                max3 = max2;
                max2 = n;
            }else if (max3 == null || n > max3) {
                max3 = n;
            }
        }
        return max3 == null ? max1 : max3;
    }
    //O(3n)省略系数为O(n)
    public int thirdMax0(int[] nums) {
        long max1 = Long.MIN_VALUE;
        if (nums.length == 1)
            return nums[0];
        for (int n : nums) {
            if (max1 < n) {
                max1 = n;
            }
        }
        long max2 = Long.MIN_VALUE;
        for (int n : nums) {
            if (max2 < n) {
                if (n == max1)  continue;
                max2 = n;
            }
        }
        long max3 = Long.MIN_VALUE;
        for (int n : nums) {
            if (max3 < n) {
                if (n == max2 || n == max1)  continue;
                max3 = n;
            }
        }
        max3 = max3 == Long.MIN_VALUE ? max1 : max3;
        return (int)max3;
    }
    //O(n)
    public int thirdMax1(int[] nums) {
        long max1 = Long.MIN_VALUE;
        long max2 = Long.MIN_VALUE;
        long max3 = Long.MIN_VALUE;
        for (int n : nums) {
            if (n == max1 || n == max2 || n == max3) continue;
            if (max1 == Long.MIN_VALUE || n > max1) {
                max3 = max2;
                max2 = max1;
                max1 = n;
            }else if (max2 == Long.MIN_VALUE || n > max2) {
                max3 = max2;
                max2 = n;
            }else if (max3 == Long.MIN_VALUE || n > max3) {
                max3 = n;
            }
        }
        return (int)(max3 == Long.MIN_VALUE ? max1 : max3);
    }

    public static void main(String[] args) {
//        int[] A = {1,2,-2147483648};
        int[] A = {2,2,3, 1};
        System.out.println(new Topic414().thirdMax1(A));
    }
}
