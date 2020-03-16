package src.Array;

/**
 * 42. Trapping Rain Water
 * Given n non-negative integers representing an elevation map where the width of each bar is 1, compute how much water it is able to trap after raining.
 *
 *
 * The above elevation map is represented by array [0,1,0,2,1,0,1,3,2,1,2,1]. In this case, 6 units of rain water (blue section) are being trapped. Thanks Marcos for contributing this image!
 *
 * Example:
 *
 * Input: [0,1,0,2,1,0,1,3,2,1,2,1]
 * Output: 6
 */
public class Topic42 {
    public int trap(int[] heght) {
        int left = 0, right = heght.length - 1;
        int ans = 0;
        int leftMax = 0, rightMax = 0;
        while (left < right) {
            if (heght[left] < heght[right]) {
                if (heght[left] >= leftMax)
                    leftMax = heght[left];
                else
                    ans += (leftMax - heght[left]);
                ++left;
            }
            else {
                if (heght[right] >= rightMax)
                    rightMax = heght[right];
                else
                    ans += (rightMax - heght[right]);
                --right;
            }
        }
        return ans;
    }
}
