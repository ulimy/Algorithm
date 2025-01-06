import java.util.Arrays;
import java.util.HashMap;

class Solution {
    public int solution(String[] friends, String[] gifts) {
        var index = new HashMap<String, Integer>();
        for (int i = 0; i < friends.length; i++) {
            index.put(friends[i], i);
        }

        int[][] giftScore = new int[friends.length][friends.length];
        for (String gift : gifts) {
            String[] f = gift.split(" ");

            int f1 = index.get(f[0]);
            int f2 = index.get(f[1]);

            giftScore[f1][f2]++;
        }

        var rate = new HashMap<Integer, Integer>();
        for (int i = 0; i < friends.length; i++) {
            rate.put(i, getScore(giftScore, i));
        }

        int[] nextMonth = new int[friends.length];
        for (int i = 0; i < giftScore.length; i++) {
            for (int j = i + 1; j < giftScore.length; j++) {
                if (giftScore[i][j] > giftScore[j][i]) {
                    nextMonth[i]++;
                } else if (giftScore[i][j] < giftScore[j][i]) {
                    nextMonth[j]++;
                } else {
                    int iScore = rate.get(i);
                    int jScore = rate.get(j);

                    if (iScore > jScore) {
                        nextMonth[i]++;
                    } else if (iScore < jScore) {
                        nextMonth[j]++;
                    }
                }
            }
        }

        return Arrays.stream(nextMonth).max().getAsInt();
    }

    private int getScore(int[][] giftScore, int target) {
        int give = 0;
        int take = 0;

        for (int i = 0; i < giftScore.length; i++) {
            give += giftScore[target][i];
            take += giftScore[i][target];
        }

        return give - take;
    }
}