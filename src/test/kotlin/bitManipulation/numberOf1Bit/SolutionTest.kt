package bitManipulation.numberOf1Bit

import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

class SolutionTest{

    val solution = Solution()

    @Test
    fun `should return 3 when 11 is pass as input`() {
        val expected = 3
        val result = solution.solve(11)

        assertEquals(expected, result)
    }

    @Test
    internal fun `should return 2 when 6 is pass as input`() {
        val expected = 2
        val result = solution.solve(6)

        assertEquals(expected, result)
    }
}