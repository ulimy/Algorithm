import java.util.Arrays;
import java.util.Map;


class Solution {
    public int[] solution(String[] park, String[] routes) {
        int x = 0;
        int y = 0;
        var parkMatrix = Arrays.stream(park).map(String::toCharArray).toArray(char[][]::new);
        var map = Map.of(
                'E', new int[]{0, 1},
                'W', new int[]{0, -1},
                'N', new int[]{-1, 0},
                'S', new int[]{1, 0}
        );


        // 시작점 찾기
        for (int i = 0; i < parkMatrix.length; i++) {
            for (int j = 0; j < parkMatrix[0].length; j++) {
                if (parkMatrix[i][j] == 'S') {
                    x = i;
                    y = j;
                    break;
                }
            }
        }

        for (String route : routes) {
            var direction = map.get(route.charAt(0));
            var count = route.charAt(2) - '0';
            var skip = false;

            var newX = x;
            var newY = y;

            for (int i = 0; i < count; i++) {
                newX += direction[0];
                newY += direction[1];

                if (newX < 0 || newX >= parkMatrix.length || newY < 0 || newY >= parkMatrix[0].length || parkMatrix[newX][newY] == 'X') {
                    skip = true;
                    break;
                }
            }

            if (!skip) {
                x = newX;
                y = newY;
            }
        }

        return new int[]{x, y};
    }
}