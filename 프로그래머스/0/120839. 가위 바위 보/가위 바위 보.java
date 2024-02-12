import java.util.Arrays;
import java.util.stream.Collectors;

class Solution {
    public String solution(String rsp) {
        return Arrays.stream(rsp.split(""))
            .map(s -> {
                if (s.equals("2")) {
                    return "0";
                } else if (s.equals("0")) {
                    return "5";
                } else {
                    return "2";
                }
            })
            .collect(Collectors.joining(""));
    }
}