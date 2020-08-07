package src.swordMeansOffer;

/**
 * 一个整型数组 nums 里除两个数字之外，其他数字都出现了两次。
 * 请写程序找出这两个只出现一次的数字。要求时间复杂度是O(n)，空间复杂度是O(1)。
 */
public class Topic56_1 {
    public int[] singleNumbers(int[] nums) {
        // 用于将所有的数异或起来
        int sum = 0;

        for (int num : nums)
            sum ^= num;

        // 获得sum中的最低位1
        int mask = 1;
        // 负数使用补码表示
        mask = sum & (-sum);

//        while ((sum & mask) == 0) {
//            mask <<= 1;
//        }
        int a = 0, b = 0;
        for (int num : nums) {
            if ((num & mask) == 0)
                a ^= num;
            else
                b ^= num;
        }
        return new int[]{a, b};
    }
}
