package strings.countOccurance

class Solution {
    fun solve(inputString: String): Int {
        val stringToMatch = "bob"
        var count = 0
        for (index in 0..inputString.length - stringToMatch.length) {
            if (inputString[index] == 'b' && inputString[index + 1] == 'o' && inputString[index + 2] == 'b') count++
        }
        return count
    }
}