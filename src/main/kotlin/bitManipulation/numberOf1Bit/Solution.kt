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

    fun solveByRightShift(input : Int) : Int{
        var number = input
        var count = 0
        while(number != 0){
            if(number and 1 == 1)count++
            number = number shr 1
        }
        return count
    }
}