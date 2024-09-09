class Solution {
    public int solution(int number, int limit, int power) {
        int[] count = new int[number + 1];

        for (int i = 1; i <= number; i++) {
            for (int j = i; j <= number; j += i) {
                count[j]++;
            }
        }

        int answer = 0;

        for (int c : count) {
            if (c > limit) {
                answer += power;
            } else {
                answer += c;
            }
        }

        return answer;
    }
}