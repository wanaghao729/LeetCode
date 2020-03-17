package src.leetcode_cn;

/**
 * 股票问题
 */
public class Topic63 {
    public int maxProfit(int[] prices) {
        int res = 0;
        for (int i = 1; i < prices.length; i++) {
            res = Math.max(res, prices[i] - prices[i-1]);
            prices[i] = Math.min(prices[i], prices[i-1]);
        }
        return res;
    }

    public int[] maxProfitIndex(int[] prices) {
        int res = 0;
        int[] index = new int[2];
        int maxIndex = 0;
        int minIndex = 0;
        for (int i = 1; i < prices.length; i++) {
            res = Math.max(res, prices[i] - prices[minIndex]);
            maxIndex = prices[i] > prices[maxIndex] ? i : maxIndex;
            minIndex = prices[i] < prices[minIndex] ? i : minIndex;
        }
        return index;
    }
}
