package src.Array;

/**
 * 11. Container With Most Water
 * Given n non-negative integers a1, a2, ..., an , where each represents a point at coordinate (i, ai). n vertical lines are drawn such that the two endpoints of line i is at (i, ai) and (i, 0). Find two lines, which together with x-axis forms a container, such that the container contains the most water.
 *
 * Note: You may not slant the container and n is at least 2.
 */
public class Topic11 {
    //思路就是最大面积取决于两个端点短的那条线，找两个指针指向两端，不断更新短的那条即可
    public int maxArea(int[] height) {
        if (height == null || height.length < 2)
            return -1;
        int maxaera = 0;
        int left = 0;
        int right = height.length - 1;
        while (left < right) {
            maxaera = Math.max(maxaera, Math.min(height[left], height[right]) * (right - left));
            if (height[left] < height[right])
                left++;
            else
                right--;
        }
        return maxaera;
    }

    public static void main(String[] args) {
        System.out.println(new Topic11().maxArea(new int[]{1,8,6,2,5,4,8,3,7}));
    }
}
