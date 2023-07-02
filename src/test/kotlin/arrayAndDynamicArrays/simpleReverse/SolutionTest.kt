package arrayAndDynamicArrays.simpleReverse

import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test
import kotlin.test.assertEquals

class SolutionTest{
    private val solution = Solution()

    @Test
    fun `should return the reverse word`() {
        val expected = "DCBA"
        val result = solution.solve("ABCD")

        assertEquals(expected, result)

    }

    @Test
    fun `should return the reverse word of ACADEMY`() {
        val expected = "YMEDACA"
        val result = solution.solve("ACADEMY")

        assertEquals(expected, result)

    }
}