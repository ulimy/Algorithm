class Solution {
    fun solution(num_list: IntArray, n: Int): Array<IntArray> {
        var answer = mutableListOf<IntArray>()

        for(i in num_list.indices step(n)){
            answer.add(num_list.copyOfRange(i,i+n))
        }
        
        return answer.toTypedArray()
    }
}