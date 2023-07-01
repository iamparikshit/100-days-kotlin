package strings.reverseString

class Solution {
    fun solve(inputString : String) : String {
        val array = inputString.split(" ")
        var result = ""
        for(index in array.lastIndex downTo  0){
            if(array[index].isNotBlank()) result = "$result ${array[index]}"
        }

        return result.trim()
    }
}