package strings.toUpper

class Solution {
    fun toUpper(charArray: CharArray): CharArray {
       for(index in charArray.indices){
           if(charArray[index] in 'a'..'z') charArray[index] = 'A' + (charArray[index] - 'a')
       }
        return charArray
    }
}