class Solution {
    public int solution(int a, int b, int c) {
        if (a != b && b != c && a != c) {
            return a + b + c;
        }

        if (a == b && b == c) {
            return (int)((a + b + c)
                * (Math.pow(a, 2) + Math.pow(b, 2) + Math.pow(c, 2))
                * (Math.pow(a, 3) + Math.pow(b, 3) + Math.pow(c, 3)));
        }

        return (int)((a + b + c)
            * (Math.pow(a, 2) + Math.pow(b, 2) + Math.pow(c, 2)));
    }
}