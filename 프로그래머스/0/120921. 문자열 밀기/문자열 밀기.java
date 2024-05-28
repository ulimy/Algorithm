class Solution {
    public int solution(String A, String B) {
        var AA = A + A;

        if (AA.contains(B)) {
            return A.length() - AA.lastIndexOf(B);
        }

        return -1;
    }
}