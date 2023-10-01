import java.util.Arrays;

class Solution {
    public int[] solution(int[] num_list) {
        int length = num_list.length;
        
        int resultNum = num_list[length - 1] > num_list[length - 2] ?
            num_list[length - 1] - num_list[length - 2] :
            num_list[length - 1] * 2;

        int[] result = Arrays.copyOf(num_list, length + 1);
        result[length] = resultNum;

        return result;
    }
}