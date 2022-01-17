package `6-MoveZeros`
//https://leetcode.com/problems/move-zeroes/
class MoveZero {
    fun moveZeroes(inputArray: IntArray): IntArray {
        val size = inputArray.size
        var countOfZeroes = 0
        val newArray = IntArray(size)

        for (index in 0 until size){
           if(elementIsZero(inputArray, index)) countOfZeroes++
            else newArray[index-countOfZeroes] = inputArray[index]
        }
        return  newArray
    }

    private fun elementIsZero(inputArray: IntArray, index: Int) = inputArray[index] == 0

    fun moveZeroesWithLambdafunction(inputArray: IntArray): IntArray{
        val anotherArray = inputArray.filter { it != 0 }.toIntArray()
        return anotherArray+IntArray(inputArray.size-anotherArray.size)
    }

    fun moveZeroWithoutUsingAnotherArray(inputArray: IntArray) : IntArray{
        var anotherIndex = 0
        for(index in 0 until inputArray.size){
            if(inputArray[index] != 0){
                swapElements(inputArray, anotherIndex, index)
                anotherIndex++
            }
        }
        return inputArray
    }

    private fun swapElements(inputArray: IntArray, anotherIndex: Int, index: Int) {
        val temp = inputArray[anotherIndex]
        inputArray[anotherIndex] = inputArray[index]
        inputArray[index] = temp
    }
}