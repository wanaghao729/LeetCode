package src.swordMeansOffer;

public class BinarySearch {
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
}
