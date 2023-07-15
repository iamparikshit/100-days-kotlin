package strings.validPalindrome

class Solution {
    fun isPalindrome(input: String): Boolean {
        val result = StringBuilder()

        for (element in input) {
            when (element) {
                in 'a'..'z' -> result.append(element)
                in 'A'..'Z' -> result.append('a' + (element - 'A'))
                in '0'..'9' -> result.append(element)
            }
        }
        return result.toString().isValidPalindrome()
    }

    private fun String.isValidPalindrome(): Boolean {
        val size = this.length
        if (size == 0) return true
        val mid = (size - 1) / 2
        var index = 0
        while (index <= mid) {
            if (this[index] != this[size - 1 - index]) return false

            index++
        }
        return true
    }
}