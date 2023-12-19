class Solution {
    fun solution(emergency: IntArray): IntArray {
        val sortedEmergency = emergency.sortedArrayDescending()
        var map = mutableMapOf<Int, Int>()

        for (i in sortedEmergency.indices) {
            map[sortedEmergency[i]] = i+1
        }

        return emergency.map {map.getOrDefault(it, 0) }.toIntArray()
    }
}