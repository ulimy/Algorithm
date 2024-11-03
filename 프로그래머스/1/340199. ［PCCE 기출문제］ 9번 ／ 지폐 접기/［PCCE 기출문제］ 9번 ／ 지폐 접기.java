import java.util.Arrays;

class Solution {
    public int solution(int[] wallet, int[] bill) {
        int answer = 0;
        Arrays.sort(wallet);
        Arrays.sort(bill);

        while (!canPut(wallet, bill)) {
            answer++;
            bill[1] /= 2;
            Arrays.sort(bill);
        }

        return answer;
    }
    
    private boolean canPut(int[] wallet, int[] bill) {
        return wallet[0] >= bill[0] && wallet[1] >= bill[1];
    }
}