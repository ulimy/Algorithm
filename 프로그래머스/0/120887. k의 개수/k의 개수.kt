class Solution {
    fun solution(i: Int, j: Int, k: Int): Int {
        return i.rangeTo(j).sumOf {
                target -> target.toString().split("").count { t -> t == k.toString() }
        }
    }
}