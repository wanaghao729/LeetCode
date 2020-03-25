package src.leetcode_cn;

/**
 * 求表面积
 */
public class Topic892 {
    public int surfaceArea(int[][] grid) {
        int n = grid.length, area = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                int level = grid[i][j];
                if (level > 0) {
                    //柱体面积
                    area += level * 4 + 2;
                    //减去与上一行相贴的面积
                    area -= i > 0 ? Math.min(level, grid[i - 1][j]) * 2 : 0;
                    //减去与上一列相贴的面积
                    area -= j > 0 ? Math.min(level, grid[i][j - 1]) * 2 : 0;
                }
            }
        }
        return area;
    }
}
