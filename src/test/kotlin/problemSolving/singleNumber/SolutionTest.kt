package problemSolving.singleNumber

import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

class SolutionTest{
    val solution = Solution()
    @Test
    fun `should return 1 when 1 ,2, 2, 3,3 are passed`() {
        val expected = 1
        val result = solution.singleNumber(intArrayOf(1,2,2,3,4,4,3))

        assertEquals(expected, result)
    }
}