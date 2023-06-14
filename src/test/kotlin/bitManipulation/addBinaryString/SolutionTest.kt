package bitManipulation.addBinaryString

import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

class SolutionTest{

    val solution = Solution()

    @Test
     fun `should return 111 when 110 and 1 are added`() {
        val expected = "111"
        val result = solution.addBinary("110","1")

        assertEquals(expected, result)
    }

    @Test
    fun `should return 110 when 100 and 10 are added`() {
        val expected = "110"
        val result = solution.addBinary("100","10")

        assertEquals(expected, result)
    }

    @Test
    fun `should return 1000  when 100 and 100 are added`() {
        val expected = "1000"
        val result = solution.addBinary("100","100")

        assertEquals(expected, result)
    }

    @Test
    fun `should return 1000  when 1111 and 1111 are added`() {
        val expected = "11110"
        val result = solution.addBinary("1111","1111")

        assertEquals(expected, result)
    }


    @Test
    fun `should return 1000  when 1010110111001101101000 and 1000011011000000111100110 are added`() {
        val expected = "1001110001111010101001110"
        val result = solution.addBinary("1010110111001101101000","1000011011000000111100110")

        assertEquals(expected, result)
    }

}