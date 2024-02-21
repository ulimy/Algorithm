import java.util.Arrays;

class Solution {
    public int[] solution(int[] arr, int[][] queries) {
        int[] answer = new int[queries.length];

        for (int i = 0; i < queries.length; i++) {
            int[] query = queries[i];
            int[] subArr = Arrays.copyOfRange(arr, query[0], query[1]+1);
            answer[i] = Arrays.stream(subArr)
                .filter(it -> it > query[2])
                .min()
                .orElse(-1);
        }

        return answer;
    }
}