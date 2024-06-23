class Solution {
    public String solution(String polynomial) {
        int coefficient = 0;
        int constant = 0;

        for (String target : polynomial.split(" \\+ ")) {
            if (target.contains("x")) {
                coefficient +=
                    (target.length() == 1) ? 1 : Integer.valueOf(target.replace("x", ""));

                continue;
            }

            constant += Integer.valueOf(target);
        }

        StringBuilder answer = new StringBuilder();

       if (coefficient > 0) {
            if (coefficient > 1) {
                answer.append(coefficient);
            }
            answer.append("x");
        }

        if (constant > 0) {
            if (coefficient > 0) {
                answer.append(" + ");
            }
            answer.append(constant);
        }

        return answer.toString();
    }
}