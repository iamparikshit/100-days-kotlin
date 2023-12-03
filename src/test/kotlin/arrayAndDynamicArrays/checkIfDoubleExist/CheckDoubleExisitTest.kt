package arrayAndDynamicArrays.checkIfDoubleExist

import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

class CheckDoubleExisitTest{
    private val checkDoubleExisit = CheckDoubleExisit()

    @Test
    fun `should return true`() {
        val input = intArrayOf(7,1,14,11)
        assertEquals(true, checkDoubleExisit.checkIfExist(input))
    }

    @Test
    fun `should return false`() {
        val input = intArrayOf(-2,0,10,-19,4,6,-8)
        assertEquals(false, checkDoubleExisit.checkIfExist(input))
    }

    @Test
    fun `should return true for 0,0`() {
        val input = intArrayOf(0,0)
        assertEquals(true, checkDoubleExisit.checkIfExist(input))
    }
}