package arrayAndDynamicArrays.copyArray

class Solution {
    fun solve(array: IntArray, numberToAdd: Int): IntArray {
        val result = IntArray(array.size) { 0 }
        for(element in array.indices){
            result[element] = array[element] + numberToAdd
        }
        return result
    }
}