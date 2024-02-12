import java.util.ArrayList;
import java.util.List;

class Solution {
    public int[] solution(int n) {
        int target = 2;
        List<Integer> result = new ArrayList<>();

        while (n > 1) {
            if (n % target == 0) {
                result.add(target);
                while (n % target == 0) {
                    n /= target;
                }
            }
            target++;
        }

        return result.stream().mapToInt(i -> i).toArray();
    }
}