import java.util.Arrays;
import java.util.Comparator;

class Solution {
    public int[] solution(int[][] score) {
        if (score.length == 0) {
            return new int[0];
        }

        double[][] arr = new double[score.length][score[0].length];

        for (int i = 0; i < score.length; i++) {
            arr[i][0] = i;
            arr[i][1] = (double)(score[i][0] + score[i][1]) / 2;
        }

        Arrays.sort(arr, Comparator.comparingDouble(i -> i[1]));

        int[] answer = new int[score.length];
        double lastScore = 100;
        int grade = 1;
        int nextGrade = 1;

        for (int i = score.length - 1; i >= 0; i--) {
            double s = arr[i][1];

            if (s < lastScore) {
                grade = nextGrade;
                lastScore = s;
            }
            answer[(int)arr[i][0]] = grade;
            nextGrade++;
        }

        return answer;
    }
}