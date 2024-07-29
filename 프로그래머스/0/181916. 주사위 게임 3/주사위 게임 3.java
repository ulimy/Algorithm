import java.util.Arrays;

class Solution {
    public int solution(int a, int b, int c, int d) {
        int[] arr = {a, b, c, d};
        Arrays.sort(arr);

        int num1 = arr[0];
        int num2 = arr[1];
        int num3 = arr[2];
        int num4 = arr[3];

        if (num1 == num4) {
            return 1111 * num1;
        }

        if (num1 == num3 || num2 == num4) {
            int p = (num1 == num3) ? num1 : num4;
            int q = (num1 == num3) ? num4 : num1;

            return (int)Math.pow((10 * p + q), 2);
        }

        if (num1 == num2 && num3 == num4) {
            return (num1 + num3) * Math.abs(num1 - num3);
        }

        if (num1 == num2) {
            return num3 * num4;
        }
        
        if (num2 == num3) {
            return num1 * num4;
        }

        if (num3 == num4) {
            return num1 * num2;
        }

        return num1;
    }
}