class Solution {
    fun solution(before: String, after: String): Int {
        val beforeArr = before.toCharArray().sorted()
        val afterArr = after.toCharArray().sorted()

        for (i in before.indices) {
            if(beforeArr[i] != afterArr[i]) return 0
        }

        return 1
    }
}