import java.util.stream.IntStream;

class Solution {
    public int[] solution(int start, int end_num) {
        return IntStream.rangeClosed(start * -1, end_num * -1)
            .map(i -> i * -1)
            .toArray();
    }
}