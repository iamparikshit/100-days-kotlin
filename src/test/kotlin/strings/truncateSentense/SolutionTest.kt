package strings.truncateSentense

import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

internal class SolutionTest{
    private val solution = Solution()

    @Test
    fun `should return first word when 1 is passed`() {
        val expected = "Hello"
        val result = solution.truncateSentence(inputString = "Hello World", count = 1)

        assertEquals(expected, result)
    }

    @Test
    fun `should return two word when 2 is passed`() {
        val expected = "Hello Parikshit"
        val result = solution.truncateSentence(inputString = "Hello Parikshit Jagtap", count = 2)

        assertEquals(expected, result)
    }

    @Test
    fun `should return three word when 2 is passed`() {
        val expected = "Hello Parikshit Jagtap"
        val result = solution.truncateSentence(inputString = "Hello Parikshit Jagtap", count = 3)

        assertEquals(expected, result)
    }
}