package src.getOffer;

import java.util.Random;

public final class StdRandom {
    private static Random random;
    private static long seed;

    static {
        seed = System.currentTimeMillis();
        random = new Random(seed);
    }

    private StdRandom() {}

    public static int uniform(int n) {
        if (n < 0)  throw new IllegalArgumentException("参数必须是正数：" + n);
        return random.nextInt(n);
    }
}
