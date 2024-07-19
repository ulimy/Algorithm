import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;

class Solution {
    public int solution(int[] array) {
        Map<Integer, Integer> map = new HashMap<>();

        for (int i : array) {
            map.put(i, map.getOrDefault(i, 0) + 1);
        }

        var sortedKey = map.keySet()
            .stream()
            .sorted(Comparator.comparing(map::get).reversed())
            .collect(Collectors.toList());

        if (sortedKey.size() > 1 && map.get(sortedKey.get(0)) == map.get(sortedKey.get(1))) {
            return -1;
        }

        return sortedKey.get(0);
    }
}