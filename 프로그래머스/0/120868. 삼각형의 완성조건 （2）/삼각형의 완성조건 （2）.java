class Solution {
    public int solution(int[] sides) {
        int max = Math.max(sides[0], sides[1]);
        int min = Math.min(sides[0], sides[1]);

        int count = 0;

        // max 가 가장 긴 변인 경우
        for (int i = 1; i <= max; i++) {
            if (max < i + min) {
                count++;
            }
        }

        // 나머지 한 변이 가장 긴 변인 경우
        int target = max + 1;
        while (target < (max + min)) {
            count++;
            target++;
        }

        return count;
    }
}