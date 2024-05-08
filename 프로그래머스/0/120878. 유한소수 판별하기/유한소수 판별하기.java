import java.util.Set;

class Solution {
    public int solution(int a, int b) {
        b /= getGCD(a, b);

        while (b != 1) {
            if (b % 2 == 0) {
                b /= 2;
            } else if (b % 5 == 0) {
                b /= 5;
            } else {
                return 2;
            }
        }

        return 1;
    }

    private int getGCD(int a, int b) {
        if (a % b == 0) {
            return b;
        }

        return getGCD(b, a % b);
    }
}