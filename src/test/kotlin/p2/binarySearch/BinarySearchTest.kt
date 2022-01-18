package p2.binarySearch

import org.junit.jupiter.api.Test
import kotlin.test.assertEquals


class `BinarySearchTest` {
    private val binarySearchObject : BinarySearch = BinarySearch()

    @Test
    fun `should return -1 when not element not found`(){
        assertEquals(-1, binarySearchObject.search(intArrayOf(-1),1))
    }

    @Test
    fun `should return index when element found`(){
        val expectedIndex = 0
        assertEquals(expectedIndex, binarySearchObject.search(intArrayOf(-1),-1))
    }

    @Test
    fun `should return index when element found for even number of elements`(){
        val expectedIndex = 4
        assertEquals(expectedIndex, binarySearchObject.search(intArrayOf(-1,0,3,5,9,12),9))
    }

    @Test
    fun `should return index when element found for odd number of elements`(){
        val expectedIndex = 1
        assertEquals(expectedIndex, binarySearchObject.search(intArrayOf(-1,0,3,5,9,12, 37),0))
    }
}