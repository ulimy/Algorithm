class Solution {
    public String solution(int age) {
        StringBuilder answer = new StringBuilder();

        while (age > 0) {
            int n = age % 10;
            answer.insert(0, (char)(n + 97));
            age /= 10;
        }
        
        return answer.toString();
    }
}