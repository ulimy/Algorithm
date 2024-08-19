import java.util.ArrayList;
import java.util.List;

class Solution {
    public int[] solution(int k, int[] score) {
        int[] answer = new int[score.length];
        List<Integer> list = new ArrayList<>();

        for (int i = 0; i < score.length; i++) {
            if (i < k) {
                list.add(score[i]);
            }

            if (i >= k && list.get(0) < score[i]) {
                list.remove(0);
                list.add(score[i]);
            }

            list.sort(null);
            answer[i] = list.get(0);

        }

        return answer;
    }
}