package Array;

/**
 * There are two sorted arrays nums1 and nums2 of size m and n respectively.
 *
 * Find the median of the two sorted arrays. The overall run time complexity should be O(log (m+n)).
 *
 * You may assume nums1 and nums2 cannot be both empty.
 *
 * Example 1:
 *
 * nums1 = [1, 3]
 * nums2 = [2]
 *
 * The median is 2.0
 * Example 2:
 *
 * nums1 = [1, 2]
 * nums2 = [3, 4]
 *
 * The median is (2 + 3)/2 = 2.5
 */
public class Topic4 {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int index1 = 0; //指向nums1
        int index2 = 0; //指向nums2
        int med1 = 0;
        int med2 = 0;
        for (int i = 0; i <= (nums1.length+nums2.length)>>1; i++) {
            med1 = med2;
            if (index1 == nums1.length) {
                med2 = nums2[index2];
                index2++;
            }else if (index2 == nums2.length) {
                med2 = nums1[index1];
                index1++;
            }else if (nums1[index1] < nums2[index2]) {
                med2 = nums1[index1];
                index1++;
            }else {
                med2 = nums2[index2];
                index2++;
            }
        }
        if ((nums1.length+nums2.length) % 2 == 0)
            return (double)(med1+med2) / 2;
        return med2;
    }

    public static void main(String[] args) {
        int[] a = {1, 2};
        int[] b = {3, 4};
        System.out.println(new Topic4().findMedianSortedArrays(a, b));
    }
}
