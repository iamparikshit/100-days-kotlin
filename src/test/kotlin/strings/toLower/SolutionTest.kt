package strings.toLower

import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

internal class SolutionTest{
    private val solution = Solution()

    @Test
     fun `should return the same array if all elements are lower case`() {
        val expected = charArrayOf('a', 'b', 'c', 'd', 'e', 'f')
        val result = solution.toLower(charArrayOf('a', 'b', 'c', 'd', 'e', 'f'))

        assertArrayEquals(expected, result)
    }

    @Test
    fun `should return the array in lower case if all elements are upper case`() {
        val expected = charArrayOf('a', 'b', 'c', 'd', 'e', 'f')
        val result = solution.toLower(charArrayOf('A', 'B', 'C', 'D', 'E', 'F'))

        assertArrayEquals(expected, result)
    }

    @Test
    fun `should return the array in lower case if some elements are not alphabets`() {
        val expected = charArrayOf('a', 'b', '#', 'd', '2', '1')
        val result = solution.toLower(charArrayOf('a','B', '#', 'D','2','1'))

        assertArrayEquals(expected, result)
    }
}