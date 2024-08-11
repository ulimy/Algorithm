class Solution {
    public int[][] solution(int n) {
        int[][] arr = new int[n][n];

        int target = 1;
        int count = n;
        int x = 0;
        int y = -1;

        while (count > 0) {
            for (int i = 0; i < count; i++) {
                y++;
                arr[x][y] = target;
                target++;
            }

            for (int i = 0; i < count - 1; i++) {
                x++;
                arr[x][y] = target;
                target++;
            }

            for (int i = 0; i < count - 1; i++) {
                y--;
                arr[x][y] = target;
                target++;
            }

            for (int i = 0; i < count - 2; i++) {
                x--;
                arr[x][y] = target;
                target++;
            }

            count -=2;
        }

        return arr;
    }
}