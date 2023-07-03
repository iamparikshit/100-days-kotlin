package strings.toLower

class Solution {
    fun toLower(inputArray: CharArray): CharArray {
        for (index in inputArray.indices) {
            if (inputArray[index] in 'A'..'Z') inputArray[index] = 'a' + (inputArray[index] - 'A')
        }
        return inputArray
    }
}