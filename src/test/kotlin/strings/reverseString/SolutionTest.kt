package strings.reverseString

import org.junit.jupiter.api.Test

class SolutionTest{
    private val solution = Solution()

    @Test
     fun `should return reverse of string`() {
        val expetced = "blue is sky"
        val result = solution.solve("sky is blue")

        kotlin.test.assertEquals(expetced, result)
    }
}