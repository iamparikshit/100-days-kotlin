package strings.reverseWordsinSentence

class ReverseWordsInSentence {

    fun reverseWords( sentence : Array<Char>) : Array<Char> {
        var reverseSentence = reverse(sentence, 0, sentence.size-1)
        var startIndex = 0
        var index = 0
        while(index < sentence.size){
            if(reverseSentence[index].equals(' ')){
                reverse(reverseSentence, startIndex, index-1)
                startIndex = index+1
            }
            index++
        }
        reverse(reverseSentence, startIndex, reverseSentence.size-1)
     return reverseSentence
    }

    fun reverse(charArray: Array<Char>, start : Int, end : Int) : Array<Char>{
        var startIndex = start
        var endIndex = end
        var temp : Char
        while(startIndex < endIndex){
            temp = charArray[endIndex]
            charArray[endIndex] = charArray[startIndex]
            charArray[startIndex] = temp
            startIndex++
            endIndex--
        }
        return charArray
    }
}