import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

class Solution {
    public List<String> solution(String my_string) {
        return Arrays.stream(my_string.split(" "))
            .filter(str -> str.length() > 0)
            .collect(Collectors.toList());
    }
}