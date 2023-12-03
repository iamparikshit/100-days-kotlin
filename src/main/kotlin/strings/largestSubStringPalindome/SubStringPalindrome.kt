package strings.largestSubStringPalindome

class SubStringPalindrome {
    fun largestLengthOfPalindrome(input : String): Int {
        var max = 1
        for(index in 0 .. input.length){
            max = Math.max(max, lengthOfPalindrome(input, index, index))
            max = Math.max(max, lengthOfPalindrome(input, index, index+1))
        }
        return max
    }

    private fun lengthOfPalindrome(input: String, start : Int, end : Int): Int {
        var startIndex = start
        var endIndex = end
        while(startIndex >= 0 && endIndex < input.length && input[startIndex]==input[endIndex]){
            startIndex--
            endIndex ++
        }
        return endIndex - startIndex -1
    }
}