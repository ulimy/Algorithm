class Solution {
    public int solution(String[][] board, int h, int w) {
        int answer = 0;
        String color = board[h][w];
        int[][] arr = {{-1, 0}, {1, 0}, {0, -1}, {0, 1}};

        for (int[] target : arr) {
            int a = h + target[0];
            int b = w + target[1];

            if (a < 0 || a >= board[0].length || b < 0 || b >= board.length) {
                continue;
            }

            if (color.equals(board[a][b])) {
                answer++;
            }
        }

        return answer;
    }
}