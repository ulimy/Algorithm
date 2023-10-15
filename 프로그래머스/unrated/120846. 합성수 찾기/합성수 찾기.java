import java.util.stream.IntStream;

class Solution {
    public int solution(int n) {
        return (int)IntStream.rangeClosed(4, n)
            .filter(this::isComposite)
            .count();
    }

    private boolean isComposite(int num) {
        int count = (int)IntStream.rangeClosed(1, num)
            .filter(target -> num % target == 0)
            .count();

        return count >= 3;
    }
}