package dynamicProgramming.buildArray

import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

class BuildArrayTest{
    val buildArray = BuildArray()

    @Test
    fun `should build 6 array`() {
        val expected = 6

        val result = buildArray.numOfArrays(2,3,1)

        assertEquals(expected, result)
    }

    @Test
    fun `should build 0 array`() {
        val expected = 0

        val result = buildArray.numOfArrays(5,2,3)

        assertEquals(expected, result)
    }
}