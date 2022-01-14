package `5-RotateArray`
//https://leetcode.com/problems/rotate-array/
class RotateArray {
    fun rotate(array: IntArray, rotateIndex: Int): IntArray {
        var indexForSlice = 0
        indexForSlice = if (rotateIndex > array.size) {
            rotateIndex % array.size
        } else {
            rotateIndex
        }
        return when (rotateIndex) {
            0 -> array
            else -> {
                var resultArray = array.copyOfRange(array.size - indexForSlice, array.size)
                resultArray += array.copyOfRange(0, array.size - indexForSlice)
                resultArray
            }
        }
    }
}