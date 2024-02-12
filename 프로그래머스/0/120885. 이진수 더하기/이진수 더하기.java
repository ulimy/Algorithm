class Solution {
    public String solution(String bin1, String bin2) {
        Integer target1 = Integer.parseInt(bin1, 2);
        Integer target2 = Integer.parseInt(bin2, 2);

        return Integer.toBinaryString(target1 + target2);
    }
}