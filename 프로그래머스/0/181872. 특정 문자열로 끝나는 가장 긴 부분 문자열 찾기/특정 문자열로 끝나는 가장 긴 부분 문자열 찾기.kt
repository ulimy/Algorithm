class Solution {
    fun solution(myString: String, pat: String): String {
        var str = myString

        while (!str.endsWith(pat)) {
            str = str.dropLast(1)
        }

        return str
    }
}