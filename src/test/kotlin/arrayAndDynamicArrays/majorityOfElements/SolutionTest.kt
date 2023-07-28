package arrayAndDynamicArrays.majorityOfElements

import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

internal class SolutionTest{
    private val solution = Solution()

    @Test
     fun `should return 3`() {
        val expected = 3
        val result = solution.majorityElement(intArrayOf(3,2,3))

        assertEquals(expected, result)
    }

    @Test
    fun `should return 2`() {
        val expected = 2
        val result = solution.majorityElement(intArrayOf(2,2,1,1,1,2,2))

        assertEquals(expected, result)
    }
}