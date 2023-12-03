package arrayAndDynamicArrays.numberOfGoodPair

import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

class NumberOfGoodPairTest{
    private val numberOfGoodPair = NumberOfGoodPair()

    @Test
    fun `should return 4 if there are 4 good pairs`(){
        val nums = intArrayOf(1,2,3,1,1,3)
        val expected = 4

        val result = numberOfGoodPair.numIdenticalPairs(nums)

        assertEquals(expected, result)
    }

    @Test
    fun `should return 6 if there are 4 good pairs`(){
        val nums = intArrayOf(1,1,1,1)
        val expected = 6

        val result = numberOfGoodPair.numIdenticalPairs(nums)

        assertEquals(expected, result)
    }

    @Test
    fun `should return 0 if there are 0 good pairs`(){
        val nums = intArrayOf(1,2,3)
        val expected = 0

        val result = numberOfGoodPair.numIdenticalPairs(nums)

        assertEquals(expected, result)
    }
}