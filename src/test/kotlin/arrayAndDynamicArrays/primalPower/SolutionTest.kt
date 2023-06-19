package arrayAndDynamicArrays.primalPower

import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

class SolutionTest {
    private val solution = Solution()

    @Test
    fun `should return 0 when even numbers are passed`() {
        val expected  = 0
        val result = solution.solve(intArrayOf(4,8))

        assertEquals(expected, result)
    }

    @Test
    fun `should return 0 when non prime numbers are passed`() {
        val expected  = 0
        val result = solution.solve(intArrayOf(6,10,-6))

        assertEquals(expected, result)
    }

    @Test
    fun `should return 1 when one prime number is present`() {
        val expected  = 1
        val result = solution.solve(intArrayOf(6,10,-6,11))

        assertEquals(expected, result)
    }
}