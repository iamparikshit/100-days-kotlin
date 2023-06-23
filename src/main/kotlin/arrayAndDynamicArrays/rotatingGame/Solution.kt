package arrayAndDynamicArrays.rotatingGame

class Solution {
    fun main(args: Array<String>): IntArray {
        // YOUR CODE GOES HERE
        // Please take input and print output to standard input/output (stdin/stdout)
        val firstLine = readLine()!!
        val secondLine = readLine()!!
        val listOfInput = firstLine.split(" ")
        val array = IntArray(listOfInput.size - 1) { 0 }
        for (index in array.indices) {
            array[index] = listOfInput[index + 1].toInt()
        }

        return solve(array, secondLine.toInt())

    }

    fun solve(array: IntArray, rightShift: Int): IntArray {
        val lengthOfArray = array.size
        val actualRightShift = rightShift % lengthOfArray
        var runningIndex: Int
        var tempNo: Int
        var totalShift = lengthOfArray - actualRightShift
        if (actualRightShift == 0) return array

        for (index in array.indices) {
            if(totalShift == 0) break
            runningIndex = (index - actualRightShift + lengthOfArray) % lengthOfArray
            tempNo = array[runningIndex]
            array[runningIndex] = array[index]
            array[index] = tempNo
            totalShift--
        }

        return array
    }

}