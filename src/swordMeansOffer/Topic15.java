package src.swordMeansOffer;

public class Topic15 {
    // 统计1的个数
    public int hammingWeight(int n) {
        int res = 0;
        while (n != 0) {
            res++;
            n &= n - 1;
        }
        return res;
    }
}
