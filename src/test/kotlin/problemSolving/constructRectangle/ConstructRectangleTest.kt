package problemSolving.constructRectangle

import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

internal class ConstructRectangleTest{
    private val solution = ConstructRectangle()

    @Test
     fun `should return 2,2 when area is 4`() {
        val expect = intArrayOf(2,2)
        val result = solution.constructRectangle(4)

        assertArrayEquals(expect, result)
    }

    @Test
    fun `should return 37,1 when area is 37`() {
        val expect = intArrayOf(37,1)
        val result = solution.constructRectangle(37)

        assertArrayEquals(expect, result)
    }

    @Test
    fun `should return 4,3 when area is 12`() {
        val expect = intArrayOf(4,3)
        val result = solution.constructRectangle(12)

        assertArrayEquals(expect, result)
    }

    @Test
    fun `should return 37,1 when area is 122122`() {
        val expect = intArrayOf(427,286)
        val result = solution.constructRectangle(122122)

        assertArrayEquals(expect, result)
    }
}