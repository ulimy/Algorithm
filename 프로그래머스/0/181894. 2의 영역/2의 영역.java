import java.util.Arrays;

class Solution {
    public int[] solution(int[] arr) {
        int min = -1;
        int max = -1;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 2) {
                min = i;
                break;
            }
        }

        for (int i = arr.length - 1; i >= 0; i--) {
            if (arr[i] == 2) {
                max = i;
                break;
            }
        }

        if (min == -1 && max == -1) {
            return new int[] {-1};
        }

        return Arrays.copyOfRange(arr,min,max+1);
    }
}