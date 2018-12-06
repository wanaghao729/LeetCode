package Array;

import java.util.ArrayList;
import java.util.List;

/**
 * 914.对数组中的重复数进行分组
 * 例：[1,1,1,2,2,2,3,3]这个数组是没法分的[1,1,1][2,2,2][3,3]每个组要保证数目相同
 * [1,1,1,2,2,2,3,3,3]这个组是可以的[1,1,1][2,2,2][3,3,3]
 */
public class Topic914 {

    public boolean hasGroupsSizeX(int[] deck) {
        int N = deck.length;
        int[] count = new int[10000];
        for (int c: deck)
            count[c]++;

        List<Integer> values = new ArrayList();
        for (int i = 0; i < 10000; ++i)
            if (count[i] > 0)
                values.add(count[i]);

        search: for (int X = 2; X <= N; ++X)
            if (N % X == 0) {
                for (int v: values)
                    if (v % X != 0)
                        continue search;
                return true;
            }

        return false;
    }

    public static void main(String[] args) {
        int[] array = {1,2,3,4,4,3,2,1};
        System.out.println(new Topic914().hasGroupsSizeX(array));
    }

}
