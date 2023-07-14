package strings.validPalindrome

import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

class SolutionTest{
    private val solution = Solution()

    @Test
    fun `should return the true if string is palindrome`() {
        val expected = true
        val input = "A man, a plan, a canal: Panama"

        val result = solution.isPalindrome(input)

        assertEquals(expected, result)
    }

    @Test
    fun `should return the false if string is not palindrome`() {
        val expected = false
        val input ="race a car"

        val result = solution.isPalindrome(input)

        assertEquals(expected, result)
    }

    @Test
    fun `should return the true if string is empty`() {
        val expected = true
        val input =""

        val result = solution.isPalindrome(input)

        assertEquals(expected, result)
    }
}