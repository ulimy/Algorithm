import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

class Solution {
    public int[] solution(String myString) {
        List<Integer> answer = Arrays.stream(myString.split("x"))
            .mapToInt(i -> i.length())
            .boxed()
            .collect(Collectors.toList());

        if (myString.endsWith("x")) {
            answer.add(0);
        }

        return answer.stream().mapToInt(i -> i).toArray();
    }
}