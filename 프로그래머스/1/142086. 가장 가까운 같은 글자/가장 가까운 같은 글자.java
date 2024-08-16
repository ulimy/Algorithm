import java.util.HashMap;
import java.util.Map;

class Solution {
    public int[] solution(String s) {
        char[] arr = s.toCharArray();
        Map<Character, Integer> map = new HashMap<>();

        int[] answer = new int[arr.length];

        for (int i = 0; i < arr.length; i++) {
            char target = arr[i];

            answer[i] = map.containsKey(target) ? i - map.get(target) : -1;
            map.put(target, i);
        }

        return answer;
    }
}