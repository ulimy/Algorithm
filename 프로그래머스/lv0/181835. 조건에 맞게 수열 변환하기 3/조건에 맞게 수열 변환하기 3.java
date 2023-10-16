import java.util.Arrays;

class Solution {
    public int[] solution(int[] arr, int k) {
        return Arrays.stream(arr)
            .map(i -> k % 2 == 1 ? i * k : i + k)
            .toArray();
    }
}