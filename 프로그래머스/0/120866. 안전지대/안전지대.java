import java.util.Arrays;

class Solution {
    public int solution(int[][] board) {
        int row = board.length;
        int col = board[0].length;
        int[][] arr = {
            {-1, 1},
            {-1, 0},
            {-1, -1},
            {0, 1},
            {0, -1},
            {1, 1},
            {1, 0},
            {1, -1}
        };

        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                if (board[i][j] != 1) {
                    continue;
                }

                for (int[] a : arr) {
                    int x = i + a[0];
                    int y = j + a[1];
                    if (isInBoard(row, col, x, y) && board[x][y] == 0) {
                        board[x][y] = -1;
                    }
                }
            }
        }

        return (int)Arrays.stream(board)
            .flatMapToInt(Arrays::stream)
            .filter(it -> it == 0)
            .count();
    }

    private boolean isInBoard(int row, int col, int x, int y) {
        return x >= 0 && x < row
            && y >= 0 && y < col;
    }
}