class Solution {
    fun solution(intStrs: Array<String>, k: Int, s: Int, l: Int): IntArray {
        val answer = intStrs.map { str -> str.substring(s, s + l).toInt() }
            .filter { i -> i > k }

        return answer.toIntArray()
    }
}