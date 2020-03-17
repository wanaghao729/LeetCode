package src.swordMeansOffer;

/**
 * 12. 矩阵中的路径
 */
public class Topic12 {
    public boolean exist(char[][] board, String word) {
        char[] chars = word.toCharArray();
        for (int i = 0; i < board.length; i++)
            for (int j = 0; j < board[0].length; j++) {
                if (dfs(board, chars, i, j, 0)) return true;
            }
        return false;
    }

    private boolean dfs(char[][] board, char[] chars, int i, int j, int i1) {
        if (i >= board.length || i < 0 || j >= board[0].length || j < 0 || board[i][j] != chars[i1])
            return false;
        if (i1 == chars.length - 1) return true;
        char tmp = chars[i1];
        board[i][j] = '/';
        boolean res = dfs(board, chars, i + 1, j, i1 + 1) || dfs(board, chars, i - 1, j, i1 + 1)
                || dfs(board, chars, i, j + 1, i1 + 1) || dfs(board, chars, i, j - 1, i1 + 1);
        board[i][j] = tmp;
        return res;
    }
}
