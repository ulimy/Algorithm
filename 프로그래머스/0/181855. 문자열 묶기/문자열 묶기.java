class Solution {
    public int solution(String[] strArr) {
       int[] arr = new int[31];

        for (String str : strArr) {
            arr[str.length()]++;
        }

        int answer = 0;

        for (int i = 0; i < 31; i++) {
            if (arr[i] > answer) {
                answer = arr[i];
            }
        }

        return answer;
    }
}