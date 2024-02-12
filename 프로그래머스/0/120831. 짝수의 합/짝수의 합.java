class Solution {
    public int solution(int n) {
        int i = 2;
        int result = 0;

        while (i <= n) {
            if ((i % 2) == 0) {
                result += i;
            }
            i++;
        }

        return result;
    }
}