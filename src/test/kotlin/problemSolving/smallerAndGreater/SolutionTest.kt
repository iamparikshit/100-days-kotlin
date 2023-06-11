package problemSolving.smallerAndGreater

import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

class SolutionTest{

    private val solution = Solution()

    @Test
     fun `should return 1 when 1,2,3 are passed as input`() {
        val expected = 1
        val result = solution.solve(intArrayOf(1,2,3))


        assertEquals(expected, result)
    }
}