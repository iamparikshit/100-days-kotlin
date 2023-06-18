package bitManipulation.reverseBits

class Solution {
    fun solve(input : UInt) : UInt {
        var reverseNo : UInt = 0u
        for(index in 0..31){
            reverseNo = reverseNo shl 1

            if(input and (1u shl index) != 0u)
                reverseNo = reverseNo or 1u
        }
        return reverseNo
    }
}



