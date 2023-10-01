import java.util.stream.IntStream;

class Solution {
    public int[] solution(int[] arr, int n) {
        if (arr.length % 2 == 0) {
            return IntStream.range(0, arr.length)
                .map(i -> {
                    if (i % 2 == 1) {
                        return arr[i] + n;
                    }
                    return arr[i];
                })
                .toArray();
        }

        return IntStream.range(0, arr.length)
            .map(i -> {
                if (i % 2 == 0) {
                    return arr[i] + n;
                }
                return arr[i];
            })
            .toArray();
    }
}