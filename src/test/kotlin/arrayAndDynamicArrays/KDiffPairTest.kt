package arrayAndDynamicArrays

import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

class KDiffPairTest{
    private val kDiffPair = KDiffPair()

    @Test
    fun `should return 2`() {
        val input = intArrayOf(3,1,4,1,5)
        val numberToFind = 2

        assertEquals(2, kDiffPair.findPairs(input, numberToFind))
    }

    @Test
    fun `should return 4`() {
        val input = intArrayOf(1,2,3,4,5)
        val numberToFind = 1

        assertEquals(4, kDiffPair.findPairs(input, numberToFind))
    }

    @Test
    fun `should return 1`() {
        val input = intArrayOf(1,3,1,5,4)
        val numberToFind = 0

        assertEquals(1, kDiffPair.findPairs(input, numberToFind))
    }
}