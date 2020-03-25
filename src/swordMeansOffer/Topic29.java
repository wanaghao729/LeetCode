package src.swordMeansOffer;

/**
 * 顺时针打印矩阵
 */
public class Topic29 {
    public int[] spiralOrder(int[][] matrix) {
        if (matrix == null)
            return null;
        if (matrix.length == 0)
            return new int[0];
        int n = matrix.length * matrix[0].length;
        int[] res = new int[n];
        int left = 0, right = matrix[0].length - 1;
        int top = 0, down = matrix.length - 1;
        int size = 0;
        while (size < n) {
            // 从左到右
            for (int i = left; i <= right && size < n; i++) {
                res[size++] = matrix[top][i];
            }

            //从上到下
            for (int j = top + 1; j <= down - 1 && size < n; j++) {
                res[size++] = matrix[j][right];
            }

            //从右到左
            for (int i = right; i >= left && size < n; i--) {
                res[size++] = matrix[down][i];
            }

            //从下到上
            for (int j = down - 1; j >= top + 1 && size < n; j--) {
                res[size++] = matrix[j][left];
            }
            left++;
            right--;
            top++;
            down--;
        }
        return res;
    }
}
