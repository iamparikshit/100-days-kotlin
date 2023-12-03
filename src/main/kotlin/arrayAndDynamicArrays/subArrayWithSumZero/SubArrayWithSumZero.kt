package arrayAndDynamicArrays.subArrayWithSumZero

class SubArrayWithSumZero {
    fun lszero(A: IntArray): IntArray {
        val sumMap = mutableMapOf<Int, Int>()
        var currentSum = 0
        var maxLength = 0
        var startIndex = -1
        var endIndex = -1

        for (i in A.indices) {
            currentSum += A[i]

            if (currentSum == 0) {
                maxLength = i + 1
                startIndex = 0
                endIndex = i
            } else if (currentSum in sumMap) {
                if (i - sumMap[currentSum]!! > maxLength) {
                    maxLength = i - sumMap[currentSum]!!
                    startIndex = sumMap[currentSum]!! + 1
                    endIndex = i
                }
            } else {
                sumMap[currentSum] = i
            }
        }

        return if (startIndex != -1 && endIndex != -1) {
            A.copyOfRange(startIndex, endIndex + 1)
        } else {
            IntArray(0)
        }

    }
}

// A = [1,2,-2,4,-4]

// 3 1 5 1

//1 = 0, 2
