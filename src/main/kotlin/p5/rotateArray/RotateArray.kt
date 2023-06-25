package p5.rotateArray
//https://leetcode.com/problems/rotate-array/
class RotateArray {
    fun rotate(inputArray: IntArray, rotateIndex: Int): IntArray {
        val indexForSlice: Int = if (rotateIndex > inputArray.size) {
            rotateIndex % inputArray.size
        } else {
            rotateIndex
        }
        return when (rotateIndex) {
            0 -> inputArray
            else -> {
                var resultArray = inputArray.copyOfRange(inputArray.size - indexForSlice, inputArray.size)
                resultArray += inputArray.copyOfRange(0, inputArray.size - indexForSlice)
                resultArray
            }
        }
    }
}