import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

class Solution {
    public int[] solution(String today, String[] terms, String[] privacies) {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy.MM.dd");

        LocalDate todayDate = LocalDate.parse(today, formatter);

        Map<String, Integer> termMap = new HashMap<>();
        for (String t : terms) {
            String[] arr = t.split(" ");
            termMap.put(arr[0], Integer.parseInt(arr[1]));
        }

        List<Integer> answer = new ArrayList<>();

        for (int i = 0; i < privacies.length; i++) {
            String[] arr = privacies[i].split(" ");
            LocalDate expireDate = LocalDate.parse(arr[0], formatter).plusMonths(termMap.get(arr[1]));

            if (todayDate.compareTo(expireDate) >=0 ) {
                answer.add(i + 1);
            }
        }

        return answer.stream().mapToInt(Integer::intValue).toArray();
    }
}