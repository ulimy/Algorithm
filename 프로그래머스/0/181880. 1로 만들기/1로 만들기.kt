class Solution {
    fun solution(num_list: IntArray): Int {
        var answer = 0

        for (i in num_list) {
            var target = i
            while (target != 1) {
                answer++
                target = if (target % 2 == 0) target / 2 else (target - 1) / 2
            }
        }

        return answer
    }
}