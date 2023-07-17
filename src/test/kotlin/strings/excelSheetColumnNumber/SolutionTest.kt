package strings.excelSheetColumnNumber

import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

internal class SolutionTest{
    private val solution = Solution()

    @Test
    fun `should return 65 when column is A`() {
        val expected = 1
        val result = solution.titleToNumber("A")

        assertEquals(expected, result)
    }

    @Test
    fun `should return 67 when column is AB`() {
        val expected = 28
        val result = solution.titleToNumber("AB")

        assertEquals(expected, result)
    }

    @Test
    fun `should return 701 when column is ZY`() {
        val expected = 701
        val result = solution.titleToNumber("ZY")

        assertEquals(expected, result)
    }
}