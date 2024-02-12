class Solution {
    public int solution(String[] order) {
        int answer = 0;

        for (var menu : order) {
            answer += getPrice(menu);
        }

        return answer;
    }

    private int getPrice(String menu) {
        switch (menu) {
            case "iceamericano", "americanoice", "hotamericano", "americanohot", "americano", "anything":
                return 4500;
            case "icecafelatte", "cafelatteice", "hotcafelatte", "cafelattehot", "cafelatte":
                return 5000;
        }

        return 0;
    }
}