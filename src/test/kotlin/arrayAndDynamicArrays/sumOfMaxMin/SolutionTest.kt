package arrayAndDynamicArrays.sumOfMaxMin

import org.junit.jupiter.api.Test
import kotlin.test.assertEquals

class SolutionTest{
    private val solution = Solution()

    @Test
     fun `should return the sum of max and min for array with length 2`() {
        val expected = 3
        val result = solution.solve(intArrayOf(1,2))

        assertEquals(expected,result)
    }

    @Test
    fun `should return the sum of max and min`() {
        val expected = 1
        val result = solution.solve(intArrayOf(-2, 1, -4, 5, 3))

        assertEquals(expected,result)
    }

    @Test
    fun `should return the sum of max and min for array with positive no only`() {
        val expected = 5
        val result = solution.solve(intArrayOf(1, 3, 4, 1))

        assertEquals(expected,result)
    }
}