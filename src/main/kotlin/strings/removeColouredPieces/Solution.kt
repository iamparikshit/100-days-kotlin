package strings.removeColouredPieces

class Solution {
    fun winnerOfGame(colors: String): Boolean {
        val array = intArrayOf(1,2,3,4)
        array.map{ println(it) }
        swap(array,1,2)
        array.map{ println(it) }

        val user = User("Parikshit", 20)
        println(user)
        changeUser(user)
        println(user)

        return checkWinner(colors, true)
    }

    private fun swap(array: IntArray, index:Int, secondIndx :Int){
        val temp = array[index]
        array[index] = array[secondIndx]
        array[secondIndx] = temp
    }

    private fun changeUser(user: User){
        user.name = "Suhani"
    }

    private fun checkWinner(inputString: String, isAliceTurn : Boolean) : Boolean{
        if(inputString.length<2) return !isAliceTurn

        val charToCompare = if (isAliceTurn) 'A' else 'B'
        var leftChar: Boolean
        var middleChar: Boolean
        var rightChar: Boolean

        for(index in 0..inputString.lastIndex-2){
            leftChar = inputString[index] == charToCompare
            middleChar = inputString[index+1] == charToCompare
            rightChar = inputString[index+2] == charToCompare

            if(leftChar && middleChar && rightChar){
                val newString = inputString.slice(0..index)+inputString.slice(index+2..inputString.lastIndex)
                return checkWinner(newString,!isAliceTurn)
            }
        }
        return !isAliceTurn
    }
}

data class User(var name : String, val age: Int)