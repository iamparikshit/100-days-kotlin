package arrayAndDynamicArrays.maxMinusMin

import org.junit.jupiter.api.Test
import kotlin.test.assertEquals

class SolutionTest{
    private val solution = Solution()

    @Test
    fun `should return subtraction of max and min element`() {
        val expected = 4
        val result = solution.solve(intArrayOf(1,2,3,4,5), 1)

        assertEquals(expected, result)
    }

    @Test
    fun `should return subtraction of 22nd max and 22nd min element`() {
        val expected = -97
        val result = solution.solve(intArrayOf(34,7,96,37,12,13,22,86,17,78,95,61,42,1,42,58,98,78,92,85,10,97), 22)

        assertEquals(expected, result)
    }

    @Test
    fun `should return subtraction of max and min element for unsorted array`() {
        val expected = 95
        val result = solution.solve(intArrayOf(5, 17, 100, 11), 1)

        assertEquals(expected, result)
    }
}