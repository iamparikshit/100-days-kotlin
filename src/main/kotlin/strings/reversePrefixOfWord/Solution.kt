package strings.reversePrefixOfWord

class Solution {
    fun reversePrefix(word: String, prefixCharacter: Char): String {
        val result = StringBuilder()
        var prefixFound = false

        for (char in word) {
            if (char == prefixCharacter && !prefixFound) {
                result.append(char).reverse()
                prefixFound = true
            } else result.append(char)
        }
        return result.toString()
    }
}