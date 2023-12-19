class Solution {
    fun solution(n: Int): Int {
        var answer: Int = 1
        var factorial: Int = 1

        while (factorial <= n) {
            answer++
            factorial *= answer
        }

        return answer-1
    }
}