package arrayAndDynamicArrays.goodPair

import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

class SolutionTest{
    private val solution = Solution()

    @Test
    fun `should return 1 if good pair is present`() {
        val expected  = 1
        val result = solution.solve(intArrayOf(1,2,3,4), 7)

        assertEquals(expected, result)
    }

    @Test
    fun `should return 0 if good pair is not present`() {
        val expected  = 0
        val result = solution.solve(intArrayOf(1,2,3,4), 8)

        assertEquals(expected, result)
    }

    @Test
    fun `should return 0 when sum is present but with same index`() {
        val expected  = 0
        val result = solution.solve(intArrayOf(1,2,4), 4)

        assertEquals(expected, result)
    }
}