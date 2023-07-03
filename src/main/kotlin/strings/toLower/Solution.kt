package strings.toLower

class Solution {
    fun toLower(inputArray: CharArray): CharArray {
        for (index in inputArray.indices) {
            if ('A'.code <= inputArray[index].code && 'Z'.code >= inputArray[index].code) inputArray[index] =
                inputArray[index] + 32
        }
        return inputArray
    }
}