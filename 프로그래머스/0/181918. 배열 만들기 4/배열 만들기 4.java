import java.util.Stack;

class Solution {
    public int[] solution(int[] arr) {
        Stack<Integer> stack = new Stack<>();
        var i = 0;

        while (i < arr.length) {
            if (stack.isEmpty()) {
                stack.push(arr[i]);
                i++;
                continue;
            }

            final var last = stack.peek();

            if (last < arr[i]) {
                stack.push(arr[i]);
                i++;
                continue;
            }

            stack.pop();
        }

        return stack.stream().mapToInt(it -> it).toArray();
    }
}