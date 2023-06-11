package problemSolving.atLeastTwoGreaterElements

import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

class SolutionTest{
    private val solution = Solution()

    @Test
    fun `should return 1,2,3 when 1,2,3,4,5 are passed as input`() {
        val expected = intArrayOf(1,2,3)
        val result = solution.solve(intArrayOf(1,2,3,4,5))


        assertArrayEquals(expected, result)
    }
}