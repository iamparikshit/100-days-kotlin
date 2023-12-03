package arrayAndDynamicArrays.pascleTriangle

import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

class PascleTriangleTest{
    private val pascleTriangle = PascleTriangle()

    @Test
    fun `should retun list when row index is pass as 6`() {
        val expected = listOf(1,6,15,20,15,6,1)

        val result = pascleTriangle.getRow(6)

        assertEquals(expected, result)
    }
}