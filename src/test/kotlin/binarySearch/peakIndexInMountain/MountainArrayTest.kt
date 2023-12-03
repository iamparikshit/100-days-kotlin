package binarySearch.peakIndexInMountain

import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

class MountainArrayTest{
    private val mountainArray = MountainArray()

    @Test
    fun `should return peak index element`() {
        val expected = 1

        val result = mountainArray.peakIndexInMountainArray(intArrayOf(0,1,0))

        assertEquals(expected, result)
    }

    @Test
    fun `should return peak index 1`() {
        val expected = 1

        val result = mountainArray.peakIndexInMountainArray(intArrayOf(0,2,1,0))

        assertEquals(expected, result)
    }

    @Test
    fun `should return peak index 1 with other values`() {
        val expected = 1

        val result = mountainArray.peakIndexInMountainArray(intArrayOf(0,20,10,9,6,2))

        assertEquals(expected, result)
    }
}