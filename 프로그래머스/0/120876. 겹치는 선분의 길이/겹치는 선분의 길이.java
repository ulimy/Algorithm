import java.util.Arrays;

class Solution {
    public int solution(int[][] lines) {
        int[] arr = new int[200];

        for (int[] line : lines) {
            for (int i = line[0]; i < line[1]; i++) {
                arr[i + 100]++;
            }
        }

        return (int) Arrays.stream(arr)
            .filter(i -> i>1)
            .count();
    }
}