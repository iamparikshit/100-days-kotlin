package `5-RotateArray`

import org.junit.jupiter.api.Test
import kotlin.test.assertEquals

class RotateArrayTest {
    val rotateArray = RotateArray()

    @Test
    fun `Should return the exact array when rotation index is zero`() {
        val array = intArrayOf(1,2,3,4,5)
        val rotationIndex = 0
        val actualResult = rotateArray.rotate(array, rotationIndex)
        val expectedArray = intArrayOf(1,2,3,4,5)

        assertEquals(expectedArray.toList(), actualResult.toList())
    }

    @Test
    fun `Should return the exact array when rotation index is one`() {
        val array = intArrayOf(1,2,3,4,5)
        val rotationIndex = 1
        val actualResult = rotateArray.rotate(array, rotationIndex)
        val expectedArray = intArrayOf(5,1,2,3,4)

        assertEquals(expectedArray.toList(), actualResult.toList())
    }

    @Test
    fun `Should return the exact array when rotation index is two`() {
        val array = intArrayOf(1,2,3,4,5)
        val rotationIndex = 2
        val actualResult = rotateArray.rotate(array, rotationIndex)
        val expectedArray = intArrayOf(4,5,1,2,3)

        assertEquals(expectedArray.toList(), actualResult.toList())
    }

    @Test
    fun `Should return the exact array when rotation index is same as array size`() {
        val array = intArrayOf(1,2,3,4,5)
        val rotationIndex = 5
        val actualResult = rotateArray.rotate(array, rotationIndex)
        val expectedArray = intArrayOf(1,2,3,4,5)

        assertEquals(expectedArray.toList(), actualResult.toList())
    }

    @Test
    fun `Should return the exact array when rotation index is greater than array size`() {
        val array = intArrayOf(1,2,3,4,5)
        val rotationIndex = 6
        val actualResult = rotateArray.rotate(array, rotationIndex)
        val expectedArray = intArrayOf(5,1,2,3,4)

        assertEquals(expectedArray.toList(), actualResult.toList())
    }
}