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
    fun `should return subtraction of 2nd max and 2nd min element`() {
        val expected = 2
        val result = solution.solve(intArrayOf(1,2,3,4,5), 2)

        assertEquals(expected, result)
    }

    @Test
    fun `should return subtraction of max and min element for unsorted array`() {
        val expected = 95
        val result = solution.solve(intArrayOf(5, 17, 100, 11), 1)

        assertEquals(expected, result)
    }
}