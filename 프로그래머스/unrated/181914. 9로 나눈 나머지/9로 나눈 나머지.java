import java.util.Arrays;

class Solution {
    public int solution(String number) {
        return Arrays.stream(number.split(""))
            .mapToInt(Integer::valueOf)
            .reduce((a, b) -> a + b)
            .getAsInt() % 9;
    }
}