class Solution {
    public int solution(String s) {
        int answer = 0;

        char[] arr = s.toCharArray();
        char x = arr[0];
        int same = 0;
        int different = 0;

        for (int i = 0; i < arr.length; i++) {
            if (i == arr.length - 1) {
                answer++;
                break;
            }

            if (x == arr[i]) {
                same++;
            } else {
                different++;
            }

            if (same == different) {
                answer++;
                same = 0;
                different = 0;
                x = arr[i + 1];
            }
        }

        return answer;
    }
}