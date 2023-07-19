package strings.excelCellInRange

import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

class SolutionTest{
    private val solution = Solution()

    @Test
     fun `should return list K1toL2 is passed`() {
        val expected = listOf("K1","K2","L1","L2")
        val result = solution.cellsInRange("K1:L2")

        assertTrue(expected.size == result.size && expected.containsAll(result) && result.containsAll(expected))
    }

    @Test
    fun `should return list A1toF1 is passed`() {
        val expected = listOf("A1","B1","C1","D1","E1","F1")
        val result = solution.cellsInRange("A1:F1")

        assertTrue(expected.size == result.size && expected.containsAll(result) && result.containsAll(expected))
    }
}