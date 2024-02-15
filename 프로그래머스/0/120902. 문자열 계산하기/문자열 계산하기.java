class Solution {
    public int solution(String my_string) {
        var arr = my_string.split(" ");
        var result = Integer.parseInt(arr[0]);

        for (int i = 1; i < arr.length - 1; i += 2) {
            int num = Integer.parseInt(arr[i + 1]);
            result += "+".equals(arr[i]) ? num : num * (-1);
        }

        return result;
    }
}