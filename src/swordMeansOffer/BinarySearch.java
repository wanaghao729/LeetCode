package src.swordMeansOffer;

import java.util.Hashtable;

public class BinarySearch {

    public static int[] b(int[] arr, int target) {
        int result1 = binarySearch(arr, target, 0, arr.length - 1);
        int result2 = result1;
        int left = result1;
        int right = result2;
        while (result1 != -1) {
            left = result1;
            result1 = binarySearch(arr, target, 0, result1 - 1);
        }

        while (result2 != -1) {
            right = result2;
            result2 = binarySearch(arr, target, result2 + 1, arr.length - 1);
        }

        return new int[]{left, right};
    }
    public static int binarySearch(int[] arr, int target, int start, int end) {

        int result = -1;
        if (start > end)    return result;

        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (arr[mid] < target)
                start = mid + 1;
            else if (arr[mid] > target)
                end = mid - 1;
            else {
                result = mid;
                break;
            }
        }
        return result;
    }
    //二分查找
    public static int binarySearch(int[] arr, int target) {
        int result = -1;
        int start = 0;
        int end = arr.length - 1;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (arr[mid] < target)
                start = mid + 1;
            else if (arr[mid] > target)
                end = mid - 1;
            else {
                result = mid;
                break;
            }
        }
        return result;
    }

    public static void main(String[] args) {
//        int[] arr = {0, 1, 1, 1, 3};
        int[] arr = {1};
        System.out.println(binarySearch(arr, 1));
        int[] a = b(arr, 1);
        System.out.println(a[0] + " " + a[1]);
    }
}
