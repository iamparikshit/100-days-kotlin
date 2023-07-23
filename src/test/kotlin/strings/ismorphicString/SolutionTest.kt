package strings.ismorphicString

import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

internal class SolutionTest{
    private val solution = Solution()

    @Test
    fun `should return true when string are isomorphic`() {
        val expected = true
        val result = solution.isIsomorphic("egg", "add")

        assertEquals(expected, result)
    }

    @Test
    fun `should return false when string are isomorphic`() {
        val expected = false
        val result = solution.isIsomorphic("foo", "bar")

        assertEquals(expected, result)
    }

    @Test
    fun `should return true when string are isomorphic for 5 letters`() {
        val expected = true
        val result = solution.isIsomorphic("bbbaaaba", "aaabbbba")

        assertEquals(expected, result)
    }
}