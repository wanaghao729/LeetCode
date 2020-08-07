package src.swordMeansOffer;

import java.util.HashSet;
import java.util.Set;

public class Topic61 {
    public boolean isStraight(int[] nums) {
        Set<Integer> repeat = new HashSet<>();
        int min = 14, max = 0;
        for (int num : nums) {
            if (num == 0)   continue;
            if (repeat.contains(num))   return false;
            max = Math.max(num, max);
            min = Math.min(num, min);
            repeat.add(num);
        }

        return max - min < 5;
    }
}
