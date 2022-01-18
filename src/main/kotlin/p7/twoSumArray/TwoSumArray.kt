package p7.twoSumArray
//https://leetcode.com/problems/two-sum-ii-input-array-is-sorted/
class TwoSumArray {
    fun twoSum(inputArray: IntArray, target: Int): IntArray {
        for (index in inputArray.indices) {
            val secondNo = getSecondNumber(inputArray[index], target)
            if (inputArray.contains(secondNo)) return intArrayOf(index + 1, inputArray.lastIndexOf(secondNo) + 1)
        }
        return inputArray
    }

    private fun getSecondNumber(firstNumber: Int, target: Int): Int {
        return target - firstNumber
    }
}

//below is one of the best ans
//https://leetcode.com/problems/two-sum-ii-input-array-is-sorted/discuss/1273272/Kotlin-100-faster-and-100-memory-effecient-or-2-pointer-solution-or-O(N)-time-or-Clean-Kotlin-Syntax