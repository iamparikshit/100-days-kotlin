package arrayAndDynamicArrays.timeToEquality

import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

class SolutionTest{
    private val solution = Solution()

    @Test
     fun `should return 8 when 2, 4, 1, 3, 2 are passed`() {
        val expected = 8
        val result = solution.solve(intArrayOf(2,4,1,3,2))

        assertEquals(expected, result)
    }
}