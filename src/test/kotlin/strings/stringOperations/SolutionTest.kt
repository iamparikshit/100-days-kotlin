package strings.stringOperations

import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

class SolutionTest{
    private val solution = Solution()

    @Test
     fun `should delete all the capital aphabets from string and concatenate the result`() {
        val expected = "xyzxyz"
        val result = solution.solve("AAxyzABABA")

        assertEquals(expected, result)
    }

    @Test
    fun `should replace all vowels with # in string`() {
        val expected = "#bc#bc"
        val result = solution.solve("AAabcABABA")

        assertEquals(expected, result)
    }

    @Test
    fun `should concatenate strings and delete the uppper case letters and replace vowels with #`() {
        val expected = "#bc#bc"
        val result = solution.solve("AAaDbUIcABABA")

        assertEquals(expected, result)
    }
}