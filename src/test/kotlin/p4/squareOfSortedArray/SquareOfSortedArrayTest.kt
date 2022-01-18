package p4.squareOfSortedArray

import org.junit.jupiter.api.Test
import kotlin.test.assertContains
import kotlin.test.assertEquals

class SquareOfSortedArrayTest {
    val squareOfSortedArray = SquareOfSortedArray()

    @Test
    internal fun `should return the square of single element`() {
        val inputArray = intArrayOf(5)
        val expectedArray = intArrayOf(25)
        val result = squareOfSortedArray.sortedSquares(inputArray)

        assertEquals(expectedArray.asList(), result.asList())
    }

    @Test
    internal fun `should return the square of array`() {
        val inputArray = intArrayOf(1,2,3,4,5)
        val expectedArray = intArrayOf(1,4,9,16,25)
        val result = squareOfSortedArray.sortedSquares(inputArray)

        assertEquals(expectedArray.asList(), result.asList())
    }

    @Test
    internal fun `should return the square of array of negative elements`() {
        val inputArray = intArrayOf(-1,1,2,3,4,5)
        val expectedArray = intArrayOf(1,1,4,9,16,25)
        val result = squareOfSortedArray.sortedSquares(inputArray)

        assertEquals(expectedArray.asList(), result.asList())
    }

    @Test
    internal fun `should return the square of array of negative elements in increasing order`() {
        val inputArray = intArrayOf(-6,-4,-1,1,2,3,4,5)
        val expectedArray = intArrayOf(1,1,4,9,16,16,25,36)
        val result = squareOfSortedArray.sortedSquares(inputArray)

        assertEquals(expectedArray.asList(), result.asList())
    }
}