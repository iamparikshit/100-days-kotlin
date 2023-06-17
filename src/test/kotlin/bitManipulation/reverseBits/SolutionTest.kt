package bitManipulation.reverseBits

import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

class SolutionTest{
    val solution = Solution()

    @Test
    fun `should return 0 when 0 is passed`() {
        val expected = 0u
        val result = solution.solve(0u)

        assertEquals(expected, result)
    }

    @Test
    fun `should return 2147483648 when 1 is passed`() {
        val expected : UInt = 2147483648u
        val result = solution.solve(1u)

        assertEquals(expected, result)
    }

    @Test
    fun `should return 3221225472 when 3 is passed`() {
        val expected : UInt = 3221225472u
        val result = solution.solve(3u)

        assertEquals(expected, result)
    }
}