package src.swordMeansOffer;

public class Topic17 {
    public int[] printNumbers(int n) {
        int max = (int)Math.pow(10, n) - 1;
        int[] res = new int[max];
        while (max > 0) {
            res[max - 1] = max;
            max--;
        }
        return res;
    }
}
