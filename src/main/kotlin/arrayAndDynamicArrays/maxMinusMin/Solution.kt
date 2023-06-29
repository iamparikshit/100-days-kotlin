package arrayAndDynamicArrays.maxMinusMin

class Solution {
    fun solve(array: IntArray, number: Int): Int {
        array.sort()
        val lengthOfArray = array.size

        return array[lengthOfArray-number] - array[number-1]
    }

}