package strings.reverseWordsinSentence

import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

class ReverseWordsInSentenceTest {
    private val reverseWordsInSentence = ReverseWordsInSentence()

    @Test
    fun `should reverse the string`() {
        assertArrayEquals(
            arrayOf('h', 'o', 'm', 'e', ' ','a', 'm', ' ','I'),
            reverseWordsInSentence.reverseWords(arrayOf('I', ' ', 'a', 'm', ' ', 'h', 'o', 'm', 'e'))
        )
    }
}