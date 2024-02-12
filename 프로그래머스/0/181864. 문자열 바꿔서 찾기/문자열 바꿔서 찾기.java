import java.util.Arrays;
import java.util.stream.Collectors;

class Solution {
    public int solution(String myString, String pat) {
        String answer = Arrays.stream(myString.split(""))
            .map(c -> "A".equals(c) ? "B" : "A")
            .collect(Collectors.joining(""));

        return answer.contains(pat) ? 1 : 0;
    }
}