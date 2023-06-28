package arrayAndDynamicArrays.subArrayWithLeastAverage

import org.junit.jupiter.api.Test
import kotlin.test.assertEquals

class SolutionTest{
    private val solution = Solution()

    @Test
    fun `should return starting index of least average`() {
        val expected = 0
        val result = solution.solve(intArrayOf(0,1,2,4,5,6), 2)

        assertEquals(expected, result)
    }

    @Test
    fun `should return 3 when 3, 7, 90, 20, 10, 50, 40 and number as 3 is passed`() {
        val expected = 3
        val result = solution.solve(intArrayOf(3, 7, 90, 20, 10, 50, 40), 3)

        assertEquals(expected, result)
    }

    @Test
    fun `should return 4 when 3, 7, 5, 20, -10, 0, 12 and number as 2 is passed`() {
        val expected = 4
        val result = solution.solve(intArrayOf(3, 7, 5, 20, -10, 0, 12), 2)

        assertEquals(expected, result)
    }

    @Test
    fun `should return 3 when 20,3,13,5,10,14, 8, 5,11,9,1,11 and number as 9 is passed`() {
        val expected = 3
        val result = solution.solve(intArrayOf(20,3,13,5,10,14,8,5,11,9,1,11), 9)

        assertEquals(expected, result)
    }
}