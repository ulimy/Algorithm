import java.util.stream.IntStream;

class Solution {
    public int solution(int n) {
        return (int)IntStream.rangeClosed(1, n)
            .filter(i -> n % 2 == 0 ? i % 2 == 0 : i % 2 != 0)
            .mapToDouble(i -> n % 2 == 0 ? Math.pow(i, 2) : i)
            .sum();
    }
}