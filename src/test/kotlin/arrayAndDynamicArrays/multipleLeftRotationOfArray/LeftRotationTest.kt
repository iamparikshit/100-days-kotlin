package arrayAndDynamicArrays.multipleLeftRotationOfArray

import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

class LeftRotationTest{
    private val leftRotation = LeftRotation()

    @Test
     fun `should return array after single rotation`() {
        val expected = arrayOf(intArrayOf(17, 100, 11, 5))
        val result = leftRotation.solve(intArrayOf(5, 17, 100, 11), intArrayOf(1))

        assertArrayEquals(expected, result)
    }

    @Test
    fun `should return array after multiple rotation`() {
        val expected = arrayOf(intArrayOf(3, 4, 5, 1, 2), intArrayOf(4, 5, 1, 2, 3))
        val result = leftRotation.solve(intArrayOf(1, 2, 3, 4, 5), intArrayOf(2, 3))

        assertArrayEquals(expected, result)
    }
}