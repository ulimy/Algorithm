import java.util.Arrays;

class Solution {
    public double solution(int[] numbers) {
        final var sum = Arrays.stream(numbers).sum();
        return (double) sum / numbers.length;
    }
}