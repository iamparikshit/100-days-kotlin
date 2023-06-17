package bitManipulation.smallestXor

import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

class SolutionTest{
    private val solution = Solution()

    @Test
    fun `should return 7 when 3,3 are passed`() {
        val expected  = 7
        val result = solution.solve(3,3)

        assertEquals(expected, result)
    }

    @Test
    fun `should return 12 when 15,2 are passed`() {
        val expected  = 12
        val result = solution.solve(15,2)

        assertEquals(expected, result)
    }

    @Test
    fun `should return 3 when 2,2 are passed`() {
        val expected  = 3
        val result = solution.solve(2,2)

        assertEquals(expected, result)
    }

    @Test
    fun `should return 63 when 4,6 are passed`() {
        val expected  = 63
        val result = solution.solve(4,6)

        assertEquals(expected, result)
    }

    @Test
    fun `should return 0 when 2,0 are passed`() {
        val expected  = 0
        val result = solution.solve(2,0)

        assertEquals(expected, result)
    }

}