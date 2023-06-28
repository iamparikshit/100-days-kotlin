package arrayAndDynamicArrays.subArrayWithLeastAverage

class Solution {
    fun solve(array: IntArray, number: Int): Int {
        var leastAverage = 100000.0
        var index = 0
        var runningAverage: Double
        var startIndex = 0

        while (index <= array.size - number) {
            runningAverage = getAverage(array, index, index + number)

            if (leastAverage > runningAverage) {
                leastAverage = runningAverage
                startIndex = index
            }
            index++
        }
        return startIndex
    }

    private fun getAverage(array: IntArray, startIndex: Int, endIndex: Int): Double {
        var sum = 0
        var index = startIndex
        while (index < endIndex) {
            sum += array[index]
            index++
        }

        return sum.toDouble()/(endIndex-startIndex)
    }
}