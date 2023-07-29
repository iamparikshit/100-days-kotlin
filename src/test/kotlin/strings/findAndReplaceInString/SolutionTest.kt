package strings.findAndReplaceInString

import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

internal class SolutionTest{
    private val solution = Solution()

    @Test
    fun `should return with target if all sources matches`() {
        val expect = "eeebffff"
        val result = solution.findReplaceString(
            inputString = "abcd",
            indices = intArrayOf(0, 2),
            sources = arrayOf("a", "cd"),
            targets = arrayOf("eee", "fff")
        )

        assertEquals(expect, result)
    }

    @Test
    fun `should return with target if some sources matches`() {
        val expect = "eeecd"
        val result = solution.findReplaceString("abcd", intArrayOf(0,2), arrayOf("ab", "ec"), arrayOf("eee", "fff"))

        assertEquals(expect, result)
    }
}