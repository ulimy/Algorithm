import java.util.stream.IntStream;

class Solution {
    public int[] solution(int[] num_list, int n) {
        IntStream before = IntStream.range(n, num_list.length).map(i -> num_list[i]);
        IntStream after = IntStream.range(0, n).map(i -> num_list[i]);

        return IntStream.concat(before, after).toArray();
    }
}