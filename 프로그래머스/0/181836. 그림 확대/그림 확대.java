class Solution {
    public String[] solution(String[] picture, int k) {
        String[] answer = new String[picture.length * k];

        for (int i = 0; i < picture.length; i++) {

            StringBuilder target = new StringBuilder();
            for (String s : picture[i].split("")) {
                target.append(s.repeat(k));
            }

            for (int j = 0; j < k; j++) {
                answer[i * k + j] = target.toString();
            }
        }

        return answer;
    }
}