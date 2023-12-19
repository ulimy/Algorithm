class Solution {
    fun solution(myStr: String): Array<String> {
        val answer = myStr.replace("a", " ")
            .replace("b", " ")
            .replace("c", " ")
            .split(" ")
            .filter { str -> str.isNotEmpty() }
            .toTypedArray()

        if (answer.isEmpty()) {
            return arrayOf("EMPTY")
        }
        
        return answer
    }
}