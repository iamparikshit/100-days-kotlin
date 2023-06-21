package arrayAndDynamicArrays.goodPair

class Solution {
    fun solve(array: IntArray, secondNumber: Int): Int {
        for (index in array.indices) {
            if (isElementPresentInArray(array, secondNumber - array[index], index)) return 1
        }
        return 0
    }

    private fun isElementPresentInArray(array: IntArray, numberToCompare: Int, indexToSkip : Int): Boolean {
        for (index in array.indices) {
            if (array[index] == numberToCompare && index!=indexToSkip) return true
        }
        return false
    }
}