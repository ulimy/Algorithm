class Solution {
    public String solution(String s, String skip, int index) {
        int[] alphabet = new int[26];

        for (char c : skip.toCharArray()) {
            alphabet[(c - 'a')] = -1;
        }

        StringBuilder answer = new StringBuilder();

        for (char c : s.toCharArray()) {
            int target = c - 'a';

            for (int i = 0; i < index; i++) {
                target++;
                while (alphabet[target % 26] == -1) {
                    target++;
                }
            }
            target %= 26;
            answer.append((char)(target + 'a'));
        }

        return answer.toString();
    }
}