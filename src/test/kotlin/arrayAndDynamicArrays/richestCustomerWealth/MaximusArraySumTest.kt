package arrayAndDynamicArrays.richestCustomerWealth

import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

internal class MaximusArraySumTest{
    private val maximusArraySum = MaximusArraySum()

    @Test
    fun `should return maximus sum`() {
        val expected = 6
        val result = maximusArraySum.maximumWealth(arrayOf(intArrayOf(1,2,3), intArrayOf(3,2,1)))

        assertEquals(expected, result)
    }

    @Test
    fun `should return maximus sum for 3 arrays`() {
        val expected = 10
        val result = maximusArraySum.maximumWealth(arrayOf(intArrayOf(1,5), intArrayOf(7,3), intArrayOf(3,5)))

        assertEquals(expected, result)
    }
}