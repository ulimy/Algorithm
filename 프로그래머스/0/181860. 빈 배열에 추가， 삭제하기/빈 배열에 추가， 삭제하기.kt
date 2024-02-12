class Solution {
    fun solution(arr: IntArray, flag: BooleanArray): IntArray {
        val list = mutableListOf<Int>()

        for (i in 0 until arr.size) {
            if (flag[i]) {
                for (j in 1..arr[i]*2) list.add(arr[i])
            } else {
                for (j in 1..arr[i]) list.removeLastOrNull()
            }
        }

        return list.toIntArray()
    }
}