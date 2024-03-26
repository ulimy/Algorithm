import java.util.HashMap;
import java.util.Map;

class Solution {
    public String solution(String[] id_pw, String[][] db) {
        Map<String, String> dbMap = new HashMap<>();
        for (String[] str : db) {
            dbMap.put(str[0], str[1]);
        }

        String id = id_pw[0];
        String pw = id_pw[1];

        if (!dbMap.containsKey(id)) {
            return "fail";
        }

        if (!pw.equals(dbMap.get(id))) {
            return "wrong pw";
        }

        return "login";
    }
}