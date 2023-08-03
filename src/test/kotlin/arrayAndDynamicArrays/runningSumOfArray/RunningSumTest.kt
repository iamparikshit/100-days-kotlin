package arrayAndDynamicArrays.runningSumOfArray

import org.junit.jupiter.api.Assertions.assertArrayEquals
import org.junit.jupiter.api.Test

internal class RunningSumTest{
    private val runningSum =RunningSum()

    @Test
     fun `should return running sum of array`() {
        val expect = intArrayOf(1,2,3,4,5)
        val result = runningSum.runningSumArray(intArrayOf(1,1,1,1,1))

        assertArrayEquals(expect, result)
    }
}