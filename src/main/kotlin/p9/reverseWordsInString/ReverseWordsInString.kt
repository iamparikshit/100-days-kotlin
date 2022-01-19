package p9.reverseWordsInString

class ReverseWordsInString {

    fun reverseWords(inputString: String) : String{
        return inputString.split(" ").joinToString(" "){ it.reversed() }
    }
}