package strings.excelSheetColumnTitle

import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

class SolutionTest{
    private val solution = Solution()

    @Test
    fun `should return A when 1 is passed`() {
        val expected = "A"
        val result = solution.convertToTitle(columnNumber = 1)

        assertEquals(expected, result)
    }

    @Test
    fun `should return Z when 26 is passed`() {
        val expected = "Z"
        val result = solution.convertToTitle(columnNumber = 26)

        assertEquals(expected, result)
    }

    @Test
    fun `should return ZY when 701 is passed`() {
        val expected = "ZY"
        val result = solution.convertToTitle(columnNumber = 701)

        assertEquals(expected, result)
    }
}