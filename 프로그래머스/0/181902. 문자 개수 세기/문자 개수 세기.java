class Solution {
    public int[] solution(String my_string) {
        int[] answer = new int[52];

        for (var target : my_string.toCharArray()) {
            final var index = (target <= 'Z') ? target - 'A' : target - 'A' - 6;
            answer[index]++;
        }

        return answer;
    }
}