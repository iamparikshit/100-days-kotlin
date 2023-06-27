package arrayAndDynamicArrays.reverseArray

import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

class SolutionTest{
    private val solution = Solution()

    @Test
    fun `should return the reverse array`() {
        val expected = intArrayOf(4,3,2,1)
        val result = solution.solve(intArrayOf(1,2,3,4))

        assertArrayEquals(expected, result)
    }

    @Test
    fun `should return the reverse array when only 2 elements are passed`() {
        val expected = intArrayOf(40,30)
        val result = solution.solve(intArrayOf(30,40))

        assertArrayEquals(expected, result)
    }
}