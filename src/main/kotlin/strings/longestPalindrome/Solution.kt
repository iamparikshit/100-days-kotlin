package strings.longestPalindrome

class Solution {
    fun longestPalindrome(inputString: String): String {
        return ""
    }

    fun String.isPalindrome() : Boolean{
        val length = this.length
        val mid = (length - 1) / 2
        var index = 0
        while(index <= mid ){
            if(this[index]==this[length-1]) continue
            else return false
            index++
        }
        return true
    }
}


