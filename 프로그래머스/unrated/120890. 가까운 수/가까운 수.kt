import kotlin.math.absoluteValue

class Solution {
    fun solution(array: IntArray, n: Int): Int {
        var answer: Int = array[0]
        var diff: Int = (n - answer).absoluteValue

        for (i in 1 until array.size) {
            if ((n - array[i]).absoluteValue == diff && answer > array[i]) {
                answer = array[i]
                diff = (n - array[i]).absoluteValue
            }

            if ((n - array[i]).absoluteValue < diff) {
                answer = array[i]
                diff = (n - array[i]).absoluteValue
            }
        }

        return answer
    }
}