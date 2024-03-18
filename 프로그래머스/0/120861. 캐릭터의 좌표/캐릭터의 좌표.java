import java.util.Map;

class Solution {
    public int[] solution(String[] keyinput, int[] board) {
        Map<String, int[]> moveMap = Map.of(
            "up", new int[] {0, 1},
            "down", new int[] {0, -1},
            "left", new int[] {-1, 0},
            "right", new int[] {1, 0}
        );

        int xMax = board[0] / 2;
        int yMax = board[1] / 2;

        int[] answer = new int[] {0, 0};

        for (String key : keyinput) {
            int[] move = moveMap.get(key);

            if (Math.abs(answer[0] + move[0]) <= xMax) {
                answer[0] += move[0];
            }

            if (Math.abs(answer[1] + move[1]) <= yMax) {
                answer[1] += move[1];
            }
        }

        return answer;
    }
}