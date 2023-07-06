package strings.isAlphaNum

class Solution {
    fun solve(charArray: CharArray): Int {
        for(element in charArray){
            if(element in 'a'..'z' || element in 'A' .. 'Z' || element in '0' .. '9') continue
            else return 0
        }
        return 1
    }
}