package bitManipulation.smallestXor

class Solution {
    fun solve(firstInput: Int, secondInput: Int): Int {
        var noOfSetBitsInSecondNo = 0
        var count = 0
        while(secondInput !=0 ){
            if(secondInput and (1 shr count) != 0) noOfSetBitsInSecondNo++
            count++
        }
        
        return 0
    }
}
