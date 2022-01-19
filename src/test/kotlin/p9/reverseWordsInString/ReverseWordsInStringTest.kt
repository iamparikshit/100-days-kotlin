package p9.reverseWordsInString

import org.junit.jupiter.api.Test
import kotlin.test.assertEquals

class ReverseWordsInStringTest {
    private val reverseWordsInString = ReverseWordsInString()
    @Test
    fun `return the input string only in reverse way`() {
        val inputString = "I"
        val result = reverseWordsInString.reverseWords(inputString)
        val expectedReverseString = "I"

        assertEquals(expectedReverseString, result)
    }

    @Test
    fun `should return MA I when send as I AM`() {
        val inputString = "I AM"
        val result = reverseWordsInString.reverseWords(inputString)
        val expectedReverseString = "I MA"

        assertEquals(expectedReverseString, result)
    }

    @Test
    fun `should return reverse of Let's take LeetCode contest`() {
        val inputString = "Let's take LeetCode contest"
        val result = reverseWordsInString.reverseWords(inputString)
        val expectedReverseString = "s'teL ekat edoCteeL tsetnoc"

        assertEquals(expectedReverseString, result)
    }
}