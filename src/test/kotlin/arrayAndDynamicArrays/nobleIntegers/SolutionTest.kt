package arrayAndDynamicArrays.nobleIntegers

import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

class SolutionTest{
    private val solution = Solution()

    @Test
     fun `should return 1 if noble integers are present`() {
        val expected = 1
        val result = solution.solve(intArrayOf(3,2,1,3))

        assertEquals(expected, result)
    }

    @Test
    fun `should return -1 if noble integers are not present`() {
        val expected = -1
        val result = solution.solve(intArrayOf(1, 1, 3, 3))

        assertEquals(expected, result)
    }
}