package problemSolving.predictWinners

import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

internal class SolutionTest{
    private val solution = Solution()

    @Test
    fun `should return false if player 1 can't win the game`() {
        val expected = false
        val result = solution.predictTheWinner(intArrayOf(1,5,2))

        assertEquals(expected, result)
    }

    @Test
    fun `should return true if player 1 can win the game`() {
        val expected = true
        val result = solution.predictTheWinner(intArrayOf(1,5,233,7))

        assertEquals(expected, result)
    }
}