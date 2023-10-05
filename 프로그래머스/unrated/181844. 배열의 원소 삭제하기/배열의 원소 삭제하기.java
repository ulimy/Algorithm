import java.util.Arrays;
import java.util.stream.IntStream;

class Solution {
    public int[] solution(int[] arr, int[] delete_list) {
        return IntStream.range(0, arr.length)
            .filter(i -> Arrays.stream(delete_list).noneMatch(j -> j == arr[i]))
            .map(i -> arr[i])
            .toArray();
    }
}