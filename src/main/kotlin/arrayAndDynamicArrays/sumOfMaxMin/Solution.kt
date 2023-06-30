package arrayAndDynamicArrays.sumOfMaxMin

class Solution {
    fun solve(array: IntArray): Int {
        var max : Int = Int.MIN_VALUE
        var min : Int = Int.MAX_VALUE

        for(element in array){
            if(element > max) max = element
            if(element < min) min = element
        }
        return max+min
    }
}