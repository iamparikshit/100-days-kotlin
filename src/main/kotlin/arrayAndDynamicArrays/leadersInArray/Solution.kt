package arrayAndDynamicArrays.leadersInArray

class Solution {
    fun solve(array: IntArray): IntArray {
        val intList = mutableListOf<Int>()
        var maxNo = 0
        for (index in array.lastIndex downTo 0) {
            if (array[index] > maxNo) {
                intList.add(array[index])
                maxNo = array[index]
            }
        }

        return intList.toIntArray().reversedArray()
    }
}

