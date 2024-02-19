class Solution {
    public String solution(String my_string, int[][] queries) {
        for (int[] query : queries) {
            var a = my_string.substring(0, query[0]);
            var b = new StringBuilder(my_string.substring(query[0], query[1] + 1))
                .reverse().toString();
            var c = my_string.substring(query[1] + 1);

            my_string = a + b + c;
        }

        return my_string;
    }
}