package src.swordMeansOffer;

//斐波那契数列
public class Topic10_1 {
    public int fib(int n) {
        if (n< 0)  return -1;
        if (n == 0) return 0;
        int a = 0;
        int b = 1;
        int sum;
        for (int i = 1; i < n; i++) {
            sum = (a + b) % 1000000007;
            a = b;
            b = sum;
        }
        return a;
    }
}
