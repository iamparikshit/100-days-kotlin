package arrayAndDynamicArrays.timeToEquality

class Solution {
    fun solve(inputArray: IntArray): Int {
        var second = 0
        val maxNumber = inputArray.maxOrNull()
        for(element in inputArray){
            second += (maxNumber!! - element)
        }
        return second
    }
}
