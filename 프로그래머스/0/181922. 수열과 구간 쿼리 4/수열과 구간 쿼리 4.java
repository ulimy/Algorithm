class Solution {
    public int[] solution(int[] arr, int[][] queries) {
        for (int[] target : queries) {
            final var k = target[2];

            for (int i = target[0]; i <= target[1]; i++) {
                if (i % k == 0) {
                    arr[i]++;
                }
            }
        }

        return arr;
    }
}