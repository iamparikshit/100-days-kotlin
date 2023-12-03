package arrayAndDynamicArrays.majorityOfElementsV2

import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

class MajorityOfElementsTest{
    private val majorityOfElements = MajorityOfElements()

    @Test
    fun `should return list of 3 when array contains 3,2,3`() {
        val array = intArrayOf(3,2,3)
        val expected = listOf(3)

        val result = majorityOfElements.majorityElement(array)

        assertEquals(expected, result)
    }

    @Test
    fun `should return list of 1 when array contains 1`() {
        val array = intArrayOf(1)
        val expected = listOf(1)

        val result = majorityOfElements.majorityElement(array)

        assertEquals(expected, result)
    }

    @Test
    fun `should return list of 1,2 when array contains 1,2`() {
        val array = intArrayOf(1,2)
        val expected = listOf(1,2)

        val result = majorityOfElements.majorityElement(array)

        assertEquals(expected, result)
    }
}