package `6-MoveZeros`

import org.junit.jupiter.api.Test
import kotlin.test.assertEquals

class MoveZeroTest {
    val moveZero = MoveZero()

    @Test
    fun `should return the array when no zeroes are present`() {
        val inputArray = intArrayOf(1,2,3,4,56)
        val expectedArray = intArrayOf(1,2,3,4,56)
        val result = moveZero.moveZeroWithoutUsingAnotherArray(inputArray)

        assertEquals(result.toList(), expectedArray.toList())
    }

    @Test
    fun `should return updated array when one zero is present`() {
        val inputArray = intArrayOf(1,2,3,0,4,56)
        val expectedArray = intArrayOf(1,2,3,4,56,0)
        val result = moveZero.moveZeroWithoutUsingAnotherArray(inputArray)

        assertEquals(result.toList(), expectedArray.toList())
    }

    @Test
    fun `should return array when only one element with zero value is present`() {
        val inputArray = intArrayOf(0)
        val expectedArray = intArrayOf(0)
        val result = moveZero.moveZeroWithoutUsingAnotherArray(inputArray)

        assertEquals(result.toList(), expectedArray.toList())
    }

    @Test
    fun `should return array with correct order when multiple zeros are present`() {
        val inputArray = intArrayOf(0,10,20,30,0,40,50,0,0,90)
        val expectedArray = intArrayOf(10,20,30,40,50,90,0,0,0,0)
        val result = moveZero.moveZeroWithoutUsingAnotherArray(inputArray)

        assertEquals(result.toList(), expectedArray.toList())
    }

    @Test
    fun `should return array with correct order when multiple zeros are present with Lambda function`() {
        val inputArray = intArrayOf(0,10,20,30,0,40,50,0,0,90)
        val expectedArray = intArrayOf(10,20,30,40,50,90,0,0,0,0)
        val result = moveZero.moveZeroesWithLambdafunction(inputArray)

        assertEquals(result.toList(), expectedArray.toList())
    }

    @Test
    fun `should return array with correct order when multiple zeros are present with using anotherArray`() {
        val inputArray = intArrayOf(0,10,20,30,0,40,50,0,0,90)
        val expectedArray = intArrayOf(10,20,30,40,50,90,0,0,0,0)
        val result = moveZero.moveZeroes(inputArray)

        assertEquals(result.toList(), expectedArray.toList())
    }
}