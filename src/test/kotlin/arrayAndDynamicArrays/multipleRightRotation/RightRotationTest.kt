package arrayAndDynamicArrays.multipleRightRotation

import org.junit.jupiter.api.Assertions.assertArrayEquals
import org.junit.jupiter.api.Test

internal class RightRotationTest{
    private val rightRotation = RightRotation()

    @Test
    fun `should return array after single rotation`() {
        val expected = arrayOf(intArrayOf(11, 5, 17, 100))
        val result = rightRotation.solve(intArrayOf(5, 17, 100, 11), intArrayOf(1))

        assertArrayEquals(expected, result)
    }

    @Test
    fun `should return array after multiple rotation`() {
        val expected = arrayOf(intArrayOf(4,5,1,2,3), intArrayOf(3,4, 5, 1, 2))
        val result = rightRotation.solve(intArrayOf(1, 2, 3, 4, 5), intArrayOf(2, 3))

        assertArrayEquals(expected, result)
    }

    @Test
    fun `should return array after 12 rotation`() {
        val expected = arrayOf(intArrayOf(4,5,1,2,3), intArrayOf(3,4, 5, 1, 2))
        val result = rightRotation.solve(intArrayOf(1, 2, 3, 4, 5), intArrayOf(12, 3))

        assertArrayEquals(expected, result)
    }
}