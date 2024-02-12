import java.util.stream.Collectors;
import java.util.stream.IntStream;

class Solution {
    public String solution(int q, int r, String code) {
        return IntStream.range(0, code.length())
            .filter(i -> i % q == r)
            .mapToObj(i -> Character.toString(code.charAt(i)))
            .collect(Collectors.joining(""));
    }
}