package problemSolving.singleNumber

class Solution {
    fun singleNumber(array: IntArray): Int {
        var result = 0
        for(element in array){
            result = result xor element
        }
        return result
    }
}