import java.util.Arrays;
import java.util.Comparator;

class Solution {
    public int[] solution(int[] numlist, int n) {
        for (int i = 0; i < numlist.length; i++) {
            numlist[i] -= n;
        }

        int[] answer = Arrays.stream(numlist)
            .boxed()
            .sorted(
                Comparator.comparingInt((Integer i) -> Math.abs(i)).thenComparingInt(i -> i*-1)
            )
            .mapToInt(Integer::intValue)
            .toArray();

        for (int i = 0; i < answer.length; i++) {
            answer[i] += n;
        }
        
        return answer;
    }
}