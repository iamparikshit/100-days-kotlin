package binarySearch.findMountainInArray

import binarySearch.peakIndexInMountain.MountainArrayTest
import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

class MountainInArrayTest{
    private val mountainInArrayTest = MountainInArray()

    @Test
    fun `should return index 2 if target matches`() {
        val expected = 2

        val result = mountainInArrayTest.findInMountainArray(2, intArrayOf(6,7,2))

        assertEquals(expected, result)
    }

    @Test
    fun `should return index 2 if target matches with different input`() {
        val expected = 2

        val result = mountainInArrayTest.findInMountainArray(9, intArrayOf(7,17,24,28,30,33,26,20,12,2))

        assertEquals(expected, result)
    }
}