package strings.longestPalindrome

import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

class SolutionTest {
    private val solution = Solution()

    @Test
    fun `should return the longest palindrome when length of string is 1`() {
        val expected = "a"
        val result = solution.longestPalindrome("a")

        assertEquals(expected, result)
    }

    @Test
    fun `should return the longest palindrome when length of string is 4`() {
        val expected = "abba"
        val result = solution.longestPalindrome("abba")

        assertEquals(expected, result)
    }

    @Test
    fun `should return substring which occurs first in case of conflict`() {
        val expected = "abbccd"
        val result = solution.longestPalindrome("bb")

        assertEquals(expected, result)
    }

    @Test
    fun `should return substring having palindrome of longest length`() {
        val expected = "aaaabaaa"
        val result = solution.longestPalindrome("aaabaaa")

        assertEquals(expected, result)
    }
}