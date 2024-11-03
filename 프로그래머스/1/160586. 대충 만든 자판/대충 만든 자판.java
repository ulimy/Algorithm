import java.util.HashMap;
import java.util.Map;

class Solution {
    public int[] solution(String[] keymap, String[] targets) {
        int[] answer = new int[targets.length];

        Map<Character, Integer> map = new HashMap<>();
        for (String key : keymap) {
            for (int i = 0; i < key.length(); i++) {
                char k = key.charAt(i);

                if (map.containsKey(k)) {
                    map.put(k, Math.min(map.get(k), i + 1));
                    continue;
                }

                map.put(key.charAt(i), i + 1);
            }
        }

        for (int i = 0; i < targets.length; i++) {
            String target = targets[i];
            int count = 0;

            for (char t : target.toCharArray()) {
                if (!map.containsKey(t)) {
                    count = -1;
                    break;
                }
                count += map.get(t);
            }

            answer[i] = count;
        }

        return answer;
    }
}