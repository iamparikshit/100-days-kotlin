package bitManipulation.numberOf1Bit

class Solution {
    fun solve(input : Int) : Int {
        var count = 0
        var number = input
        while(number != 0){
            number = number and (number - 1)
            count++
        }
        return count
    }
}