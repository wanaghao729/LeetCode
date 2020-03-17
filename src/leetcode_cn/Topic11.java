package src.leetcode_cn;

public class Topic11 {
    public int minArray(int[] numbers) {
        int i = 0;
        int j = numbers.length - 1;
        while (i < j) {
            int m = (i + j) / 2;
            if (numbers[m] > numbers[j])    i = m + 1;  //m在左排序数组
            else if (numbers[m] < numbers[j])   j = m;  //m在右排序数组
            else j--;
        }
        return numbers[j];
    }
}
