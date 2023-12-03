package dynamicProgramming.paintingTheWalls

import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

class PaintWallTest{
    private val paintWall = PaintWall()

    @Test
    fun `should paint the all in minimum amount of cost`() {
        val expected = 46
        val result = paintWall.paintWalls(intArrayOf(76,25,96,46,85,19,29,88,2,5), intArrayOf(1,2,1,3,1,3,3,3,2,1))

        assertEquals(expected, result)
    }
}