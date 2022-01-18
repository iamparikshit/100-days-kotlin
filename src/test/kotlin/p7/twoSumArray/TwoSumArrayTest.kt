package p7.twoSumArray

import org.junit.jupiter.api.Test
import kotlin.test.assertEquals

class TwoSumArrayTest {
    val twoSumArray = TwoSumArray()

    @Test
    fun `should return the array`(){
        val inputArray = intArrayOf(1,2)
        val target = 3
        val result = twoSumArray.twoSum(inputArray,target)
        val expectedArray = intArrayOf(1,2)

        assertEquals(expectedArray.toList(), result.toList())
    }

    @Test
    fun `should return the sum of 5`(){
        val inputArray = intArrayOf(1,2,3)
        val target = 5
        val result = twoSumArray.twoSum(inputArray,target)
        val expectedArray = intArrayOf(2,3)

        assertEquals(expectedArray.toList(), result.toList())
    }

    @Test
    fun `should return the sum of 90`(){
        val inputArray = intArrayOf(1,2,3,44,46)
        val target = 90
        val result = twoSumArray.twoSum(inputArray,target)
        val expectedArray = intArrayOf(4,5)

        assertEquals(expectedArray.toList(), result.toList())
    }

    @Test
    fun `should return the sum of 6`(){
        val inputArray = intArrayOf(2,3,4)
        val target = 6
        val result = twoSumArray.twoSum(inputArray,target)
        val expectedArray = intArrayOf(1,3)

        assertEquals(expectedArray.toList(), result.toList())
    }

    @Test
    fun `should return the sum of -1`(){
        val inputArray = intArrayOf(-1,0)
        val target = -1
        val result = twoSumArray.twoSum(inputArray,target)
        val expectedArray = intArrayOf(1,2)

        assertEquals(expectedArray.toList(), result.toList())
    }

    @Test
    fun `should return the sum of 0`(){
        val inputArray = intArrayOf(0,0,3,4)
        val target = 0
        val result = twoSumArray.twoSum(inputArray,target)
        val expectedArray = intArrayOf(1,2)

        assertEquals(expectedArray.toList(), result.toList())
    }
}