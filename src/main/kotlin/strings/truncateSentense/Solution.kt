package strings.truncateSentense

import java.lang.StringBuilder

class Solution {
    fun truncateSentence(inputString: String, count: Int): String {
        val listOfWords = inputString.split(" ")
        val result = StringBuilder()
        
        for (index in 0 until count){
            if(index==0) result.append(listOfWords[index])
            else result.append(" ${listOfWords[index]}")
        }

        return result.toString()
    }
}