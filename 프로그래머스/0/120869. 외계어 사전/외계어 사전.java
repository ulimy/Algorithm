import java.util.Arrays;
import java.util.Optional;

class Solution {
    public int solution(String[] spell, String[] dic) {
        Optional<String> any = Arrays.stream(dic)
            .filter(i -> i.length() == spell.length)
            .filter(i -> Arrays.asList(i.split("")).containsAll(Arrays.asList(spell)))
            .findAny();

        return any.isPresent() ? 1 : 2;
    }
}