class Solution {
    fun solution(my_string: String, indices: IntArray): String {
        var str = StringBuilder()
        val arr = my_string.toCharArray()

        for (i in 0..(arr.size-1)) {
            if (!indices.contains(i)) str.append(arr[i])
        }

        return str.toString()
    }
}