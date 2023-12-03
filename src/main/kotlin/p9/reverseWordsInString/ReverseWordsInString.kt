package p9.reverseWordsInString

class ReverseWordsInString {

    fun reverseWords(inputString: String) : String{
        val no  = 10
        val result = no.add100 { it }
        return inputString.split(" ").joinToString(" "){ it.reversed() }
    }

    private fun Int.add100(transform : (Int) -> Int): Int {
        return this + 100
    }
}