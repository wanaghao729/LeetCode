package src.swordMeansOffer;


public class Topic39 {
    public int majorityElement(int[] nums) {
        if (nums == null || nums.length == 0)   return -1;
        int rep = 0, votes = 0;
        for (int num : nums) {
            if (votes == 0) rep = num;
            votes += rep == num ? 1 : -1;
        }
        return rep;
    }
}
