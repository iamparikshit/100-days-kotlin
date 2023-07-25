package strings.sortVowelsInString

import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

internal class SolutionTest{
    private val solution = Solution()

    @Test
    fun `should return the consonant as is`() {
        val expected = "ssddvv"
        val result = solution.sortVowels("ssddvv")

        assertEquals(expected, result)
    }

    @Test
    fun `should return the consonant as is and vowel in sorted manner`() {
        val expected = "sAsadedvov"
        val result = solution.sortVowels("sosAdadvev")

        assertEquals(expected, result)
    }

    @Test
    fun `should return vowel in sorted manner`() {
        val expected = "lEOtcede"
        val result = solution.sortVowels("lEetcOde")

        assertEquals(expected, result)
    }

    @Test
    fun `should return consonant in sorted manner`() {
        val expected = "lYmpH"
        val result = solution.sortVowels("lYmpH")

        assertEquals(expected, result)
    }
}