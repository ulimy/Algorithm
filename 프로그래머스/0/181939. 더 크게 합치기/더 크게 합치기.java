class Solution {
    public int solution(int a, int b) {
        Integer ab = Integer.valueOf(String.valueOf(a) + String.valueOf(b));
        Integer ba = Integer.valueOf(String.valueOf(b) + String.valueOf(a));

        return ab > ba ? ab : ba;
    }
}