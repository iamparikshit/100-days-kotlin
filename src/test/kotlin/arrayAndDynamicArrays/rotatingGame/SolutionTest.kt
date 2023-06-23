package arrayAndDynamicArrays.rotatingGame

import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

class SolutionTest{
    val solution = Solution()

    @Test
    fun `should return same array as input when rotating is 0`() {
        val expectedArray = intArrayOf(1,2,3,4,5,)
        val result = solution.solve(intArrayOf(1,2,3,4,5),0)

        assertArrayEquals(expectedArray,result)
    }

    @Test
    fun `should return array by rotating the array by 1 on right side`() {
        val expectedArray = intArrayOf(2,3,4,5,1)
        val result = solution.solve(intArrayOf(1,2,3,4,5),1)

        assertArrayEquals(expectedArray,result)
    }

    @Test
    fun `should return array by rotating the array by 2 on right side`() {
        val expectedArray = intArrayOf(3,4,5,1,2)
        val result = solution.solve(intArrayOf(1,2,3,4,5),2)

        assertArrayEquals(expectedArray,result)
    }

    @Test
    fun `should return array by rotating the array by 3 on right side`() {
        val expectedArray = intArrayOf(4,5,1,2,3)
        val result = solution.solve(intArrayOf(1,2,3,4,5),3)

        assertArrayEquals(expectedArray,result)
    }

    @Test
    fun `should rotate array by 1 when right shift is 6`() {
        val expectedArray = intArrayOf(2,3,4,5,1)
        val result = solution.solve(intArrayOf(1,2,3,4,5),6)

        assertArrayEquals(expectedArray,result)
    }
}