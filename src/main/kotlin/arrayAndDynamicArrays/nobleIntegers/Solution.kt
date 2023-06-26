package arrayAndDynamicArrays.nobleIntegers

class Solution {
    fun solve(array: IntArray): Int {
        for(element in array){
            if(element == getCountForGreaterThanNumber(element, array)) return 1
        }
        return -1
    }

    private fun getCountForGreaterThanNumber(number : Int, array: IntArray) : Int {
        var count = 0
        for(element in array){
            if(element > number) count++
        }
        return count
    }
}