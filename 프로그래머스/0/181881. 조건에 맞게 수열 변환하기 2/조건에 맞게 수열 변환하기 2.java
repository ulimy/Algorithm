import java.util.Arrays;

class Solution {
    public int solution(int[] arr) {
        var answer = -1;
        var before = new Object[arr.length];
        var after = Arrays.stream(arr).boxed().toArray();

        while (!Arrays.deepEquals(before, after)) {
            answer++;
            before = Arrays.copyOf(after, after.length);

            for (int i = 0; i < before.length; i++) {
                var target = (int)before[i];

                if (target >= 50 && target % 2 == 0) {
                    after[i] = target / 2;
                    continue;
                }

                if (target < 50 && target % 2 == 1) {
                    after[i] = target * 2 + 1;
                }
            }
        }

        return answer;
    }
}