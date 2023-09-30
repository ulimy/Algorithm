import java.util.Arrays;

class Solution {
    public int solution(int[] num_list) {
        int multiply = Arrays.stream(num_list)
            .reduce((x, y) -> x * y)
            .getAsInt();

        double num = Math.pow(Arrays.stream(num_list).sum(), 2);

        return multiply < num ? 1 : 0;
    }
}