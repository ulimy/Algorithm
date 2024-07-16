class Solution {
    public String solution(String code) {
        StringBuilder answer = new StringBuilder();

        boolean mode = true;
        String[] codeList = code.split("");

        for (int i = 0; i < codeList.length; i++) {

            if (codeList[i].equals("1")) {
                mode = !mode;
                continue;
            }

            if (mode && i % 2 == 0) {
                answer.append(codeList[i]);
            }

            if (!mode && i % 2 == 1) {
                answer.append(codeList[i]);
            }
        }

        return (answer.length() == 0) ? "EMPTY" : answer.toString();
    }
}