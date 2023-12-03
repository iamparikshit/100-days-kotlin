package strings.largestSubStringPalindome

import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

class SubStringPalindromeTest{
    private val subStringPalindrome = SubStringPalindrome()

    @Test
    fun `should return the largest length of palindrom in substring`() {
        val expected = 3
        assertEquals(expected, subStringPalindrome.largestLengthOfPalindrome("abcdad"))
    }

    @Test
    fun `should return the largest length of palindrom of 8`() {
        val expected = 8
        assertEquals(expected, subStringPalindrome.largestLengthOfPalindrome("xbdyzzydbdyzdx"))
    }
}