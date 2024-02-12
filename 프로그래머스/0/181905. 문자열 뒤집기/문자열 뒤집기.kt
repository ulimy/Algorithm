class Solution {
    fun solution(my_string: String, s: Int, e: Int): String {
        val start = my_string.substring(0,s)
        val middle = my_string.substring(s,e+1)
        val end = my_string.substring(e+1,my_string.length)
        
        val reversedMiddle = StringBuilder(middle).reverse()

        return start+reversedMiddle+end
    }
}