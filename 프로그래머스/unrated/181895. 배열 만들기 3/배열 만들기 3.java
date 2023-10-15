import java.util.Arrays;

class Solution {
    public int[] solution(int[] arr, int[][] intervals) {
        return Arrays.stream(intervals)
            .map(interval -> Arrays.copyOfRange(arr, interval[0], interval[1] + 1))
            .flatMapToInt(i -> Arrays.stream(i))
            .toArray();
    }
}