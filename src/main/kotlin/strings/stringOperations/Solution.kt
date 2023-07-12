package strings.stringOperations

import java.lang.StringBuilder

class Solution {
    fun solve(inputString: String): String {
        val result = StringBuilder()

        for (index in inputString.indices) {
            if (inputString[index] in 'a'..'z') {
                if (inputString[index].isVowel()) result.append("#")
                else result.append(inputString[index])
            }
        }
        result.append(result)
        return result.toString()
    }

    private fun Char.isVowel(): Boolean {
        return when (this) {
            'a' -> true
            'e' -> true
            'i' -> true
            'o' -> true
            'u' -> true
            else -> false
        }
    }
}