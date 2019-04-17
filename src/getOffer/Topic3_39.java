package getOffer;

/**
 * 《剑指Offer》p39页：找出数组中的重复数字
 */
public class Topic3_39 {
    int duplicate(int[] numbers) {
        int duplicate_num = -1;
        if (numbers==null || numbers.length<0) {
            return duplicate_num;
        }

        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] < 0 || numbers[i] > numbers.length-1)
                return duplicate_num;
        }

        for (int i = 0; i < numbers.length; i++) {
            while (numbers[i] != i) {
                if (numbers[i] == numbers[numbers[i]]) {
                    duplicate_num = numbers[i];
                    return duplicate_num;
                }
                int tmp = numbers[i];
                numbers[i] = numbers[tmp];
                numbers[tmp] = tmp;
            }
        }
        return duplicate_num;
    }

    public static void main(String[] args) {
        int[] test = {2,3,1,0,2,5,3};
        System.out.println(new Topic3_39().duplicate(test));
    }
}
