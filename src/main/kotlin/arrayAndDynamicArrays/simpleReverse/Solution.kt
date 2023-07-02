package arrayAndDynamicArrays.simpleReverse

class Solution {
    fun solve(inputString: String): String {
        val charArray = inputString.toCharArray()
        val size = charArray.size
        var temp: Char

        for (index in 0 until size / 2) {
            temp = charArray[index]
            charArray[index] = charArray[size - 1 - index]
            charArray[size - 1 - index] = temp
        }

        return String(charArray)
    }
}
