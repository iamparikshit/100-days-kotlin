package bitManipulation.smallestXor

class Solution {
    fun solve(firstInput: Int, secondInput: Int): Int {
        var result = firstInput
        var noOfSetBitsInFirst = 0
        while (result > 0) {
            if (result and 1 == 1) noOfSetBitsInFirst++
            result = result shr 1
        }

        return BitManipulation(firstInput, noOfSetBitsInFirst, secondInput).smallestXor()
    }

    data class BitManipulation(
        val number: Int,
        val noOfSetBits: Int,
        val numberToCompare: Int,
        val indexToShift: Int = 0
    ) {
        fun smallestXor(): Int {
            if (numberToCompare == noOfSetBits) return number
            else if (noOfSetBits > numberToCompare){
                 if(isSetBit()) return removeSetBit().smallestXor()
            }else if (isUnSetBit()) return addSetBit().smallestXor()
            return inCrementIndexByOne().smallestXor()
        }

        private fun isSetBit(): Boolean {
            return number and (1 shl indexToShift) != 0
        }

        private fun isUnSetBit(): Boolean {
            return !isSetBit()
        }

        private fun unSetBit(): Int {
            return number and (1 shl indexToShift).inv()
        }

        private fun setBit(): Int {
            return number or (1 shl indexToShift)
        }

        private fun removeSetBit(): BitManipulation {
            return BitManipulation(
                number = unSetBit(),
                noOfSetBits = noOfSetBits - 1,
                numberToCompare = numberToCompare,
                indexToShift = indexToShift + 1
            )
        }

        private fun addSetBit(): BitManipulation {
            return BitManipulation(
                number = setBit(),
                noOfSetBits = noOfSetBits + 1,
                numberToCompare = numberToCompare,
                indexToShift = indexToShift + 1
            )
        }

        private fun inCrementIndexByOne(): BitManipulation {
            return BitManipulation(
                number = number,
                noOfSetBits = noOfSetBits,
                numberToCompare = numberToCompare,
                indexToShift = indexToShift + 1
            )
        }
    }
}

//Logic :
//1. B > noOfsetBits -> set from right for unsetbits
//2. B < noOfsetBits -> remove set bits from lsb
//3. b = noOssetBits -> done

