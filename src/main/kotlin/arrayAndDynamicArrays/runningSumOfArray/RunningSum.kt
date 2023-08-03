package arrayAndDynamicArrays.runningSumOfArray

class RunningSum {
    fun runningSumArray(inputArray: IntArray): IntArray {
        var sum = 0
        return inputArray.map { sum += it; sum }.toIntArray()
    }
}