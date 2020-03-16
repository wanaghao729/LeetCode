package src.getOffer;

/**
 * 题目描述
 * 在一个二维数组中（每个一维数组的长度相同），每一行都按照从左到右递增的顺序排序，
 * 每一列都按照从上到下递增的顺序排序。请完成一个函数，输入这样的一个二维数组和一个整数，判断数组中是否含有该整数。
 */
public class Topic1 {
    public boolean Find(int target, int [][] array) {
        boolean isFound = false;
        if (array == null || array.length == 0)    return false;
        int column = array[0].length - 1;
        int row = 0;
        while (row < array.length && column >= 0) {
            int value = array[row][column];
            if (target > value) {
                row++;
            } else if (target < value) {
                column--;
            } else {
                isFound = true;
                break;
            }
        }
        return isFound;
    }
}
