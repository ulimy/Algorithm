class Solution {
    public int solution(int[][] dots) {
        int[][] arr = new int[][] {
            {0, 1, 2, 3},
            {0, 2, 1, 3},
            {0, 3, 1, 2}
        };

        for (int[] a : arr) {
            double slope1 = (double)(dots[a[0]][1] - dots[a[1]][1]) / (double)(dots[a[0]][0] - dots[a[1]][0]);
            double slope2 = (double)(dots[a[2]][1] - dots[a[3]][1]) / (double)(dots[a[2]][0] - dots[a[3]][0]);

            if (slope1 == slope2) {
                return 1;
            }
        }

        return 0;
    }
}