package problemSolving.minimumTimeToArriveOnTime

import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

internal class SolutionTest{
    private val solution = Solution()

    @Test
    fun `should have minimum speed of 1 to reach on time in 6 hrs`() {
        val expected = 1
        val hours = 6.0
        val dist = intArrayOf(1,3,2)

        val result = solution.minSpeedOnTimeUsingBinarySearch(dist, hours)

        assertEquals(expected, result)
    }

    @Test
    fun `should have minimum speed of 3 to reach on time in 2 dot 7 hrs`() {
        val expected = 3
        val hours = 2.7
        val dist = intArrayOf(1,3,2)

        val result = solution.minSpeedOnTimeUsingBinarySearch(dist, hours)

        assertEquals(expected, result)
    }

    @Test
    fun `should have minimum speed of 10000000 to reach on time in 2 dot 01 hrs`() {
        val expected = 10000000
        val hours = 2.01
        val dist = intArrayOf(1,1,100000)

        val result = solution.minSpeedOnTimeUsingBinarySearch(dist, hours)

        assertEquals(expected, result)
    }

    @Test
    fun `should return -1 when its not possible to reach on time in 1 dot 9 hrs`() {
        val expected = -1
        val hours = 1.9
        val dist = intArrayOf(1,3,2)

        val result = solution.minSpeedOnTimeUsingBinarySearch(dist, hours)

        assertEquals(expected, result)
    }
}