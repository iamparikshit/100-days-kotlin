package strings.backspaceCompare

import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

class BackspaceCompareTest{
    private val backspaceCompare = BackspaceCompare()

    @Test
    fun `should return true if both input string are same`() {
        val expected = true
        val result = backspaceCompare.backspaceCompare("ab#c", "ad#c")

        assertEquals(expected, result)
    }

    @Test
    fun `should return true if both input string are ab## and c#d#`() {
        val expected = true
        val result = backspaceCompare.backspaceCompare("ab##", "c#d#")

        assertEquals(expected, result)
    }

    @Test
    fun `should return false if both input string are ac# and b`() {
        val expected = false
        val result = backspaceCompare.backspaceCompare("ac#", "b")

        assertEquals(expected, result)
    }

    @Test
    fun `should return false if both input string are a#cc and b#cd`() {
        val expected = false
        val result = backspaceCompare.backspaceCompare("a#cc", "b#cd")

        assertEquals(expected, result)
    }
}