package strings.validParatheses

import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

class SolutionTest {
    private val solution = Solution()

    @Test
     fun `should return true when parentheses are valid`() {
        val expected = true
        val result = solution.isValid("[]")

        assertEquals(expected, result)
    }

    @Test
    fun `should return true when different parentheses are valid`() {
        val expected = true
        val result = solution.isValid("[()]")

        assertEquals(expected, result)
    }

    @Test
    fun `should return false when  parentheses are invalid`() {
        val expected = false
        val result = solution.isValid("[(])")

        assertEquals(expected, result)
    }
}