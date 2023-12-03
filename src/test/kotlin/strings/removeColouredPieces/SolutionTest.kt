package strings.removeColouredPieces

import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

class SolutionTest{
    private val solution = Solution()

    @Test
    fun `should return true if alice can win`() {
        val expected = true
        val result = solution.winnerOfGame("AAABABB")

        assertEquals(expected, result)
    }

    @Test
    fun `should return false if alice can't win`() {
        val expected = false
        val result = solution.winnerOfGame("AA")

        assertEquals(expected, result)
    }

    @Test
    fun `should return false if Bob can win`() {
        val expected = false
        val result = solution.winnerOfGame("ABBBBBBBAAA")

        assertEquals(expected, result)
    }
}