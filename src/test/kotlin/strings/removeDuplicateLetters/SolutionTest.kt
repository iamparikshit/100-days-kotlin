package strings.removeDuplicateLetters

import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

internal class SolutionTest{
    private val solution = Solution()

    @Test
    fun `should remove the 1 duplicate letters`() {
        val expected = "abc"
        val result = solution.removeDuplicateLetters("babc")

        assertEquals(expected, result)
    }

    @Test
    fun `should remove the 2 duplicate letters`() {
        val expected = "abc"
        val result = solution.removeDuplicateLetters("bbabc")

        assertEquals(expected, result)
    }

    @Test
    fun `should remove the 3 duplicate letters`() {
        val expected = "sabc"
        val result = solution.removeDuplicateLetters("sbbacbc")

        assertEquals(expected, result)
    }
}