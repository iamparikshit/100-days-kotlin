package arrayAndDynamicArrays.subArrayWithSumZero

import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

class SubArrayWithSumZeroTest{
    private val subArrayWithSumZero = SubArrayWithSumZero()

    @Test
    fun `should return array`() {
        assertArrayEquals(intArrayOf(2,-2,4,-4), subArrayWithSumZero.lszero(intArrayOf(1,2,-2,4,-4)))
    }
}