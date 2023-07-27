package strings.reversePrefixOfWord

import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

internal class SolutionTest{
    private val solution = Solution()

    @Test
     fun `should return as is if no prefix is found`() {
        val expected = "abcd"
        val result = solution.reversePrefix("abcd", 'z')

        assertEquals(expected, result)
    }

    @Test
    fun `should return reverse till prefix is found`() {
        val expected = "cbad"
        val result = solution.reversePrefix("abcd", 'c')

        assertEquals(expected, result)
    }

    @Test
    fun `should return reverse till first prefix is found`() {
        val expected = "cbadca"
        val result = solution.reversePrefix("abcdca", 'c')

        assertEquals(expected, result)
    }
}