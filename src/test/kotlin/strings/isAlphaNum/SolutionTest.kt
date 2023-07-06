package strings.isAlphaNum

import org.junit.jupiter.api.Test
import kotlin.test.assertEquals

class SolutionTest{
    private val solution = Solution()

    @Test
     fun `should return 1 when array contains only alphabets`() {
        val expected = 1
        val result = solution.solve(charArrayOf('a','A','Z'))

        assertEquals(expected, result)
    }

    @Test
    fun `should return 1 when array contains only digits`() {
        val expected = 1
        val result = solution.solve(charArrayOf('1','2','3'))

        assertEquals(expected, result)
    }

    @Test
    fun `should return 1 when array contains only digits and alphabets`() {
        val expected = 1
        val result = solution.solve(charArrayOf('1','2','3', 'C', 'b'))

        assertEquals(expected, result)
    }

    @Test
    fun `should return 0 when array contains special characters`() {
        val expected = 0
        val result = solution.solve(charArrayOf('1','2','3', 'C', 'b', '#'))

        assertEquals(expected, result)
    }
}