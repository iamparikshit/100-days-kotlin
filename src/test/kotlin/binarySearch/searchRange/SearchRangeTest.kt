package binarySearch.searchRange

import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

class SearchRangeTest{
    private val searchRange = SearchRange()

    @Test
    fun `should return the upper bound and lower bound of array`() {
        val expected = intArrayOf(3,4)

        val result = searchRange.searchRange(intArrayOf(5,7,7,8,8,10), 8)

        assertArrayEquals(expected, result)
    }

    @Test
    fun `should return -1-1 when no element found`() {
        val expected = intArrayOf(-1,-1)

        val result = searchRange.searchRange(intArrayOf(5,7,7,8,8,10), 6)

        assertArrayEquals(expected, result)
    }

    @Test
    fun `should return -1-1 for empty array`() {
        val expected = intArrayOf(-1,-1)

        val result = searchRange.searchRange(intArrayOf(), 0)

        assertArrayEquals(expected, result)
    }
}