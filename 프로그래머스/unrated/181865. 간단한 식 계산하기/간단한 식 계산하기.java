class Solution {
    public int solution(String binomial) {
        String[] arr = binomial.split(" ");
        int a = Integer.parseInt(arr[0]);
        int b = Integer.parseInt(arr[2]);

        switch (arr[1]) {
            case "+":
                return a + b;
            case "-":
                return a - b;
            case "*":
                return a * b;
        }

        return 0;
    }
}