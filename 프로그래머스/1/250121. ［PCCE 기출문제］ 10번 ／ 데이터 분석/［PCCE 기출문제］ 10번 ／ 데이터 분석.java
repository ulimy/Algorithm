import java.util.Arrays;
import java.util.Comparator;
import java.util.Map;

class Solution {
    public int[][] solution(int[][] data, String ext, int val_ext, String sort_by) {
        Map<String, Integer> map = Map.of(
            "code", 0,
            "date", 1,
            "maximum", 2,
            "remain", 3
        );

        Arrays.sort(data, Comparator.comparingInt(a -> a[map.get(sort_by)]));

        return Arrays.stream(data)
            .filter(a -> a[map.get(ext)] < val_ext)
            .toArray(int[][]::new);
    }
}