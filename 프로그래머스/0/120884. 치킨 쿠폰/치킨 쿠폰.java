class Solution {
    public int solution(int chicken) {
        if (chicken == 0) {
            return 0;
        }
        
        int answer = -1;

        while (chicken > 0) {
            chicken -= 9;
            answer++;
        }

        return answer;
    }
}