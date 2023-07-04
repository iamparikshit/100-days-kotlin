package strings.toUpper

import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

class SolutionTest{
    private val solution = Solution()


    @Test
    fun `should return the same array if all elements are Upper case`() {
        val expected = charArrayOf('A', 'B', 'C', 'D', 'E', 'F')
        val result = solution.toUpper(charArrayOf('A', 'B', 'C', 'D', 'E', 'F'))

        assertArrayEquals(expected, result)
    }

    @Test
    fun `should return the array in lower case if all elements are lower case`() {
        val expected = charArrayOf('A', 'B', 'C', 'D', 'E', 'F')
        val result = solution.toUpper(charArrayOf('a', 'b', 'c', 'd', 'e', 'f'))

        assertArrayEquals(expected, result)
    }

    @Test
    fun `should return the array in lower case if some elements are not alphabets`() {
        val expected = charArrayOf('A', 'B', '#', 'D', '2', '1')
        val result = solution.toUpper(charArrayOf('a','B', '#', 'D','2','1'))

        assertArrayEquals(expected, result)
    }
}