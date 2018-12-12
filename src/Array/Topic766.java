package Array;

/**
 * 判定矩阵对角元素是否相同
 * matrix = [
 *   [1,2,3,4],
 *   [5,1,2,3],
 *   [9,5,1,2]
 * ]
 * "[9]", "[5, 5]", "[1, 1, 1]", "[2, 2, 2]", "[3, 3]", "[4]"
 * 对角元素相同即为true
 */
public class Topic766 {
    public boolean isToeplitzMatrix(int[][] matrix) {
        int R = matrix.length;
        int C = matrix[0].length;
        for (int r = 0; r < R; r++) {
            for (int c = 0; c < C; c++) {
                if (r > 0 && c > 0 && matrix[r][c] != matrix[r-1][c-1])
                    return false;
            }
        }
        return true;
    }
    //下面这种写法比上面效率低得多
    public boolean isToeplitzMatrix0(int[][] matrix) {
        int R = matrix.length - 1;
        int C = matrix[0].length - 1;
        for (int r = 0; r < R; r++) {
            for (int c = 0; c < C; c++) {
                if (matrix[r][c] != matrix[r+1][c+1])
                    return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        int[][] M = {{1, 2}, {2, 2}};
        System.out.println(new Topic766().isToeplitzMatrix(M));
    }
}
