import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

class Solution {
    public String solution(String my_string) {
        String[] arr = my_string.split("");
        Set<String> set = new HashSet<>(Arrays.asList(arr));

        StringBuilder answer = new StringBuilder();

        for (int i = 0; i < my_string.length(); i++) {
            String target = "" + my_string.charAt(i);
            if (set.contains(target)) {
                answer.append(target);
                set.remove(target);
            }
        }
        
        return answer.toString();
    }
}