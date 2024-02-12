class Solution {
    public String solution(int[] numLog) {
        StringBuilder answer = new StringBuilder();

        for (int i = 0; i < numLog.length - 1; i++) {
            int start = numLog[i];
            int end = numLog[i + 1];

            if (start + 1 == end) {
                answer.append("w");
                continue;
            }

            if (start - 1 == end) {
                answer.append("s");
                continue;
            }

            if (start + 10 == end) {
                answer.append("d");
                continue;
            }

            answer.append("a");
        }

        return answer.toString();
    }
}