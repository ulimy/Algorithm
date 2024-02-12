class Solution {
    fun solution(arr: IntArray, queries: Array<IntArray>): IntArray {
        for (target in queries) {
            val temp = arr[target[0]]
            arr[target[0]] = arr[target[1]]
            arr[target[1]] = temp
        }
        
        return arr
    }
}