package bitManipulation.singleNumber

class Solution {
    fun solve(array: IntArray): IntArray {
        var sumOfTwoSingleNumber = 0
        var posOfSetBit = 0
        var index = 0;
        var firstNumber = 0
        var secondNumber = 0

        for (element in array) {
            sumOfTwoSingleNumber = sumOfTwoSingleNumber xor element
        }

        while (sumOfTwoSingleNumber > 0) {
            if (sumOfTwoSingleNumber and 1 == 1) {
                posOfSetBit = index
                break;
            }
            index++
            sumOfTwoSingleNumber = sumOfTwoSingleNumber shr 1
        }

        for (element in array) {
            if (element and (1 shl posOfSetBit) != 0) {
                firstNumber = firstNumber xor element
            } else {
                secondNumber = secondNumber xor element
            }
        }
        return intArrayOf(Math.min(firstNumber, secondNumber), Math.max(firstNumber, secondNumber))
    }
}