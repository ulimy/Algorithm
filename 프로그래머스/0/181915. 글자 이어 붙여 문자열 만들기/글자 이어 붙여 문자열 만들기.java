class Solution {
    public String solution(String my_string, int[] index_list) {
        String[] arr = my_string.split("");
        StringBuilder result = new StringBuilder();

        for (int index : index_list) {
            result.append(arr[index]);
        }

        return result.toString();
    }
}