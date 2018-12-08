package Array;

import java.util.Arrays;

/**
 * 和leetcode第一道题目类似，那个题目没指名A有序
 *给定整型数组A(数组内元素升序排列)和目标数值target
 * 返回A中元素相加等于target的位置
 * numbers = [2,7,11,15], target = 9
 * 返回值[1,2] A[1-1]+A[2-1]=9
 */
public class Topic167 {

//    if-else判定时让多的情况在前，尽量少的执行语句
    public int[] twoSum(int[] numbers, int target) {
        int[] indice = new int[2];
        if (numbers == null || numbers.length < 2)
            return indice;
        int left = 0;
        int right = numbers.length - 1;
        while (left < right) {
            int v = numbers[left] + numbers[right];
            if (v == target) {
                indice[0] = left + 1;
                indice[1] = right + 1;
                return indice;
            } else if (v > target) {
                right--;
            } else {
                left++;
            }
        }
        return indice;
    }

//    这个方法执行时间大约比上面快1ms,但还是喜欢上面的写法，做了空指针检查
    public int[] twoSum1(int[] numbers, int target) {
        int n = numbers.length;
        int i = 0, j = n - 1;
        int p = -1, q = -1;

        while( i < j) {
            int x = numbers[i] + numbers[j];
            if(target > x ) i++;
            else if(target < x) j--;
            else {
                p = i + 1;
                q = j + 1;
                break;
            }
        }
        return new int[] {p, q};
    }
    public static void main(String[] args) {
        int[] numbers = {2,7,11,15};
        System.out.println(Arrays.toString(new Topic167().twoSum(numbers, 9)));
    }
}
