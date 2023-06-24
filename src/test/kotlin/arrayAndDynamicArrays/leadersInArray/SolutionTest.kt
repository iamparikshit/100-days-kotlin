package arrayAndDynamicArrays.leadersInArray

import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

class SolutionTest{
    private val solution = Solution()

    @Test
     fun `should return leader elements`() {
        val expected = intArrayOf(17,5,2)
        val result = solution.solve(intArrayOf(16, 17, 4, 3, 5, 2))

        assertArrayEquals(expected, result)
    }

    @Test
    fun `should return single leader element`() {
        val expected = intArrayOf(6)
        val result = solution.solve(intArrayOf(1,2,3,4,5,6))

        assertArrayEquals(expected, result)
    }

    @Test
    fun `should return entire elements as leader element`() {
        val expected = intArrayOf(6,5,4,3,2,1)
        val result = solution.solve(intArrayOf(6,5,4,3,2,1))

        assertArrayEquals(expected, result)
    }
}
