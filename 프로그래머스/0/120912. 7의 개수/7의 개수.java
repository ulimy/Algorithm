import java.util.Arrays;

class Solution {
    public int solution(int[] array) {
        return Arrays.stream(array)
            .map(i -> getSevenCount(i))
            .sum();
    }

    private int getSevenCount(int target) {
        int count = 0;
        while (target > 0) {
            if (target % 10 == 7) {
                count++;
            }
            target /= 10;
        }
        return count;
    }
}