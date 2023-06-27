package arrayAndDynamicArrays.reverseArray

class Solution {
    fun solve(array: IntArray): IntArray {
        val size = array.size
        val resultArray = IntArray(size) { 0 }

        var startingIndex = 0
        val mid = size / 2
        while (startingIndex <= mid) {
            resultArray[startingIndex] = array[size - startingIndex - 1]
            resultArray[size - startingIndex - 1] = array[startingIndex]
            startingIndex++
        }
        return resultArray
    }
}
