package src.swordMeansOffer;

public class Topic56_2 {
    public int singleNumber(int[] nums) {
        // x ^ 0 = x​ ， x ^ 1 = ~x
        // x & 0 = 0 ， x & 1 = x
        int ones = 0, twos = 0;
        for (int num : nums) {
            ones = ones ^ num & ~twos;
            twos = twos ^ num & ~ones;
        }
        return ones;
    }
}
