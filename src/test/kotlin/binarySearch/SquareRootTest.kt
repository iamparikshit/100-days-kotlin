package binarySearch

import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

class SquareRootTest{
    private val squareRoot = SquareRoot()

    @Test
    fun `should return 2 for square root of 8`() {
        val number = 8
        val expected = 2

        val result = squareRoot.mySqrt(number)

        assertEquals(expected, result)
    }

    @Test
    fun `should return 3 for square root of 9`() {
        val number = 9
        val expected = 3

        val result = squareRoot.mySqrt(number)

        assertEquals(expected, result)
    }

    @Test
    fun `should return 4 for square root of 16`() {
        val number = 16
        val expected = 4

        val result = squareRoot.mySqrt(number)

        assertEquals(expected, result)
    }

    @Test
    fun `should return 2 for square root of 4`() {
        val number = 4
        val expected = 2

        val result = squareRoot.mySqrt(number)

        assertEquals(expected, result)
    }

    @Test
    fun `should return 46340 for square root of 2147395600`() {
        val number = 2147395600
        val expected = 46340

        val result = squareRoot.mySqrt(number)

        assertEquals(expected, result)
    }
}