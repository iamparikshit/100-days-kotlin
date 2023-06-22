package arrayAndDynamicArrays.fizzBuzz

import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

class SolutionTest{
    private val solution = Solution()

    @Test
    fun `should return 1 2 Fizz 4 Buzz when 5 is passed`() {
        val expected = arrayOf("1","2", "Fizz", "4", "Buzz")
        val result = solution.fizzBuzz(5)

        assertArrayEquals(expected, result)
    }
}