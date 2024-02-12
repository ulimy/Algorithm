import java.util.Arrays;
import java.util.stream.Collectors;

class Solution {
    public int solution(String[] s1, String[] s2) {
        var length = s1.length;
        
        var set = Arrays.stream(s1)
            .collect(Collectors.toSet());
        
        set.removeAll(Arrays.asList(s2));
        
        return length - set.size();
    }
}