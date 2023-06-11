package problemSolving.patternPrinting

import org.junit.jupiter.api.Assertions.assertArrayEquals
import org.junit.jupiter.api.Assertions.assertTrue
import org.junit.jupiter.api.Test

class SolutionTest{
    private val solution = Solution()

    @Test
    fun `should return 1 when 1 is passed as input`() {
        val expected = intArrayOf(1)
        val result = solution.solve(1)

        assertTrue(arrayOf(expected).contentDeepEquals(result))
    }

    @Test
    fun `should return 1,0 and 1,2 when 2 is passed as input`() {
        val expected = arrayOf(intArrayOf(1,0), intArrayOf(1,2))
        val result = solution.solve(2)

        assertArrayEquals(expected, result)

    }
}