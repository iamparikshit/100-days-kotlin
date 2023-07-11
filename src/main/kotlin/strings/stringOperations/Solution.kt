package strings.stringOperations

class Solution {
    fun solve(inputString: String): String {
        var result = ""
        for (index in inputString.indices) {
            result = if (inputString[index].isVowel()) "$result#"
            else if (inputString[index] in 'A'..'Z') continue
            else "$result${inputString[index]}"
        }
        result = "$result$result"
        return result
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