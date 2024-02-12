import kotlin.math.log2
import kotlin.math.pow

class Solution {
    fun solution(arr: IntArray): IntArray {
val log = log2(arr.size.toDouble())

        val n = if (log % 1 == 0.0) log else log + 1

        val target = (2.0).pow(n.toInt()).toInt()

        val result = mutableListOf<Int>()

        arr.forEach { result.add(it) }

        for (i in arr.size + 1..target) {
            result.add(0)
        }

        return result.toIntArray()
    }
}