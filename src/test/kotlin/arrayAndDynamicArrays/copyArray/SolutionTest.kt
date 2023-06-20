package arrayAndDynamicArrays.copyArray

import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

class SolutionTest{
    private val solution = Solution()

    @Test
    fun `should return array of 5,5,5`() {
        val expectedArray = intArrayOf(5,5,5)
        val result = solution.solve(intArrayOf(1,1,1), 4)

        assertArrayEquals(expectedArray, result)
    }

    @Test
    fun `should return array of 5,15,25`() {
        val expectedArray = intArrayOf(5,15,25)
        val result = solution.solve(intArrayOf(1,11,21), 4)

        assertArrayEquals(expectedArray, result)
    }
}