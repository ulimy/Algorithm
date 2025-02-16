class Solution {
    public int solution(int[] bandage, int health, int[][] attacks) {
        int answer = health;

        int maxTime = bandage[0];
        int recover = bandage[1];
        int extraRecover = bandage[2];
        int before = 0;

        for (int[] attack : attacks) {
            int gap = attack[0] - before - 1;

            answer = Math.min(health, answer + (gap / maxTime * extraRecover));
            answer = Math.min(health, answer + (gap * recover));

            answer -= attack[1];
            before = attack[0];

            if (answer <= 0) {
                return -1;
            }
        }

        return answer <= 0 ? -1 : answer;
    }
}