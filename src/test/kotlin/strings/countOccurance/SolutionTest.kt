package strings.countOccurance

import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

class SolutionTest{
    private val solution = Solution()

    @Test
     fun `should return 1 when bob is present in string`() {
        val expected = 1
        val result = solution.solve("bob")

        assertEquals(expected, result)
    }

    @Test
    fun `should return 2 when bob is present twice in string`() {
        val expected = 2
        val result = solution.solve("bobob")

        assertEquals(expected, result)
    }
}