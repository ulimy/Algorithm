import java.util.Arrays;
import java.util.Comparator;
import java.util.stream.IntStream;

class Solution {
    public int solution(int[] rank, boolean[] attendance) {
        var arr = IntStream.range(0, rank.length)
            .filter(i -> attendance[i])
            .boxed()
            .sorted(Comparator.comparingInt(i -> rank[i]))
            .mapToInt(Integer::intValue)
            .toArray();

        return 10000 * arr[0] + 100 * arr[1] + arr[2];
    }
}