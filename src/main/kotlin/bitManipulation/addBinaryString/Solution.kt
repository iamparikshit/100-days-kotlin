package bitManipulation.addBinaryString

class Solution {
    fun addBinary(firstArray: String, secondArray: String): String {
        var secondInput = secondArray
        var firstInput = firstArray
        var result = ""
        var carry = 0
        var sum: Int

        if(firstArray.length > secondArray.length){
            for(element in secondArray.length .. firstArray.lastIndex){
                secondInput = "0$secondInput"
            }
        }else{
            for(element in firstArray.length .. secondArray.lastIndex){
                firstInput = "0$firstInput"
            }
        }

        for(index in firstInput.lastIndex downTo 0){
            sum = firstInput[index].digitToInt() + secondInput[index].digitToInt() + carry
            carry = sum / 2
            result += (sum % 2)
        }

        if(carry == 1) result += "1"
        return result.reversed()
    }

}