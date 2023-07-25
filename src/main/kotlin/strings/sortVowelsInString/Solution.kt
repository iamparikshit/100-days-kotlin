package strings.sortVowelsInString

class Solution {
    fun sortVowels(inputString: String): String {
        val vowelString = StringBuilder()
        for(char in inputString){
            if(char.isVowel()) vowelString.append(char)
        }
        val result = vowelString.toString().toCharArray().sortedArray()

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
    private fun String.lowestASCIIIndex() : Char {
        this.toCharArray().sortedArray()
    }
}