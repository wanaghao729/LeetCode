package src.getoffer;

public class Topic4_44 {
    boolean find(int[][] matrix, int num) {
        boolean found = false;
        int rows = matrix.length;
        int columns = matrix[0].length;
        if (matrix != null && rows > 0 && columns > 0) {
            int row = 0;
            int column = columns - 1;
            while (row < rows && column > 0) {
                if (matrix[row][column] == num) {
                    found = true;
                    break;
                }
                else if (matrix[row][column] > num)
                    column--;
                else
                    row++;
            }
        }
        return found;
    }

    public static void main(String[] args) {
        int[][] test = {{1,2,8,9}, {2,4,9,12}, {4,7,10,13}, {6,8,11,15}};
        System.out.println(new Topic4_44().find(test, 16));
    }
}
