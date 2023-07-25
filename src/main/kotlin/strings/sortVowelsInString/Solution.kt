package strings.sortVowelsInString

class Solution {
    fun sortVowels(inputString: String): String {
        val outputSting = StringBuilder()
        val sortedVowelArray = inputString.getVowels().sortedVowels()

        var indexOfSortedVowel = 0
        inputString.map {
            when (it.isVowel()) {
                true -> {
                    outputSting.append(sortedVowelArray[indexOfSortedVowel])
                    indexOfSortedVowel++
                }
                false -> outputSting.append(it)
            }
        }

        return outputSting.toString()
    }

    private fun String.getVowels(): String {
        val vowel = StringBuilder()

        this
            .filter { it.isVowel() }
            .map { vowel.append(it) }

        return vowel.toString()
    }

    private fun String.sortedVowels() = this.toCharArray().sortedArray()
    private fun Char.isVowel(): Boolean {
        return when (this) {
            'a' -> true
            'e' -> true
            'i' -> true
            'o' -> true
            'u' -> true
            'A' -> true
            'E' -> true
            'I' -> true
            'O' -> true
            'U' -> true
            else -> false
        }
    }
}