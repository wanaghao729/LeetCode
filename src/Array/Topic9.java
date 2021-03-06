package Array;

/**
 * Palindrome Number
 * Determine whether an integer is a palindrome. An integer is a palindrome when it reads the same backward as forward.
 *
 * Example 1:
 *
 * Input: 121
 * Output: true
 * Example 2:
 *
 * Input: -121
 * Output: false
 * Explanation: From left to right, it reads -121. From right to left, it becomes 121-. Therefore it is not a palindrome.
 * Example 3:
 *
 * Input: 10
 * Output: false
 * Explanation: Reads 01 from right to left. Therefore it is not a palindrome.
 * Follow up:
 *
 * Coud you solve it without converting the integer to a string?
 */
public class Topic9 {
    public boolean isPalindrome(int x) {
//        x是负数或者末位是0肯定不是回文数(0除外)
        if (x < 0 || (x != 0 && x % 10 == 0))
            return false;
        int rev = 0;
        while (x > rev) {
//            逆转原数
            rev = rev * 10 + x % 10;
            x /= 10;
        }
//        x == rev意味着原数是偶数数位
        return (x == rev || x == rev / 10);
    }

    public static void main(String[] args) {
        System.out.println(new Topic9().isPalindrome(121));
        System.out.println(new Topic9().isPalindrome(1221));
        System.out.println(new Topic9().isPalindrome(120));
    }
}
