import java.util.Arrays;
import java.util.Comparator;

class Solution {
    public int solution(int[][] dots) {
        Arrays.sort(
            dots,
            Comparator.comparingInt(num1 -> num1[0])
        );

        int row = dots[2][0] - dots[0][0];
        int col = dots[1][1] - dots[0][1];

        return row * col;
    }
}