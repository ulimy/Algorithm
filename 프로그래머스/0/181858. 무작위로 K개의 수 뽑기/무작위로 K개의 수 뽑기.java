import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

class Solution {
    public int[] solution(int[] arr, int k) {
        int[] answer = new int[k];
        Arrays.fill(answer, -1);
        Set<Integer> set = new HashSet<>();
        var index = 0;

        for (int i = 0; i < arr.length; i++) {
            if (index == k) {
                break;
            }

            if (set.contains(arr[i])) {
                continue;
            }

            answer[index] = arr[i];
            index++;
            set.add(arr[i]);
        }

        return answer;
    }
}