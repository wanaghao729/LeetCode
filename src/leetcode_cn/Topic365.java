package src.leetcode_cn;

/**
 * 水壶问题
 * 有两个容量分别为 x升 和 y升 的水壶以及无限多的水。请判断能否通过使用这两个水壶，从而可以得到恰好 z升 的水？
 */
public class Topic365 {
    public boolean canMeasureWater(int x, int y, int z) {
        if (x + y < z)  return false;
        if (x == 0 || y == 0)
            return z == 0 || x + y == z;
        return z % getGCD(x, y) == 0;
    }

    private int getGCD(int a, int b) {
        if (a < 0 || b < 0)
            return -1;
        if (b == 0)
            return a;
        while (a % b != 0) {
            int tmp = a % b;
            a = b;
            b = tmp;
        }
        return b;
    }
}
