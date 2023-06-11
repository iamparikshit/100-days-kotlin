package problemSolving.minimumPicks

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class SolutionTest{
    private val solution = Solution()

    @Test
    fun `should return -7 when 0,2,9 are passed as input`() {
        val expected = -7
        val result = solution.solve(intArrayOf(0,2,9))


        assertEquals(expected, result)
    }
}