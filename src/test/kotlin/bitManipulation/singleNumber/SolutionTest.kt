package bitManipulation.singleNumber

import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

class SolutionTest{
    private val solution = Solution()

    @Test
    fun `should return 1,3 when 1,2,3,2,4,5,5,4 are passed`() {
        val expectedArray = intArrayOf(3,1)
        val result = solution.solve(intArrayOf(1,2,3,2,4,5,5,4))

        assertArrayEquals(expectedArray, result)
    }

    @Test
    fun `should return 1,3 when 1,3 are passed`() {
        val expectedArray = intArrayOf(3,1)
        val result = solution.solve(intArrayOf(1,3))

        assertArrayEquals(expectedArray, result)
    }
}