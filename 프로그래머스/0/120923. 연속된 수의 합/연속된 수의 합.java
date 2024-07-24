import java.util.stream.IntStream;

class Solution {
    public int[] solution(int num, int total) {
        if (num == 1) {
            return new int[] {total};
        }
        
        int temp = IntStream.range(0, num).sum();
        int start = (total - temp) / num;

        return IntStream.range(start, start + num).toArray();
    }
}