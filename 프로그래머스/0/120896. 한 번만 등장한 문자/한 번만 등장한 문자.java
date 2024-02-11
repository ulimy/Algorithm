import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;

class Solution {
    public String solution(String s) {
        final Map<Character, Integer> map = new HashMap<>();

        for (char c : s.toCharArray()) {
            map.put(c, map.getOrDefault(c, 0) + 1);
        }

        return map.keySet().stream()
            .filter(it -> map.get(it) == 1)
            .sorted()
            .map(String::valueOf)
            .collect(Collectors.joining(""));
    }
}