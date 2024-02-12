class Solution {
    fun solution(my_string: String): Int {
       return my_string.replace("[^0-9]".toRegex()," ")
           .split(" ")
           .filter{str -> str.isNotEmpty()}
           .sumOf { str -> str.toInt() }
    }
}