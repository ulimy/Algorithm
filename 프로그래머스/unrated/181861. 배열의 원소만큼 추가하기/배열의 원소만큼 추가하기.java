import java.util.Arrays;

class Solution {
    public int[] solution(int[] arr) {
        return Arrays.stream(arr)
            .mapToObj(target -> {
                int[] targetArray = new int[target];
                Arrays.fill(targetArray, target);
                return targetArray;
            })
            .flatMap(ints -> Arrays.stream(ints).boxed())
            .mapToInt(Integer::intValue)
            .toArray();
    }
}