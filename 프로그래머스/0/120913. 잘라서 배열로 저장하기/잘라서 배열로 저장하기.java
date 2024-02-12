import java.util.ArrayList;
import java.util.List;

class Solution {
    public String[] solution(String my_str, int n) {
        List<String> answer = new ArrayList<>();

        while (my_str.length() > n) {
            answer.add(my_str.substring(0, n));
            my_str = my_str.substring(n);
        }

        answer.add(my_str);

        return answer.stream().toArray(String[]::new);
    }
}