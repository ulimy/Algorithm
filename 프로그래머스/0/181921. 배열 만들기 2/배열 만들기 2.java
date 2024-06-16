import java.util.stream.IntStream;

class Solution {
    public int[] solution(int l, int r) {
        var arr = IntStream.rangeClosed(l, r)
            .filter(i ->
                String.valueOf(i)
                    .replaceAll("0", "")
                    .replaceAll("5", "")
                    .equals("")
            )
            .toArray();
        
        return arr.length == 0 ? new int[] {-1} : arr;
    }
}