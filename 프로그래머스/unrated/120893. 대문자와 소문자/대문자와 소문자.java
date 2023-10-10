import java.util.Arrays;
import java.util.stream.Collectors;

class Solution {
    public String solution(String my_string) {
        return Arrays.stream(my_string.split(""))
            .map(s -> s.matches("[a-z]") ? s.toUpperCase() : s.toLowerCase())
            .collect(Collectors.joining(""));
    }
}