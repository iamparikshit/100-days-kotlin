package p3.searchInsert

import org.junit.jupiter.api.Test
import p3.searchInsert.SearchInsert
import kotlin.test.assertEquals

//https://leetcode.com/problems/search-insert-position/
class SerachInsertTest {
    val searchInsert = SearchInsert()
    @Test
    fun `should return index when target found in array`(){
        val expected = 2
        val result = searchInsert.searchInsert(intArrayOf(1,3,5,6),5)

        assertEquals(expected,result)
    }

    @Test
    fun `should return accurate search index when target not found in array`(){
        val expected = 1
        val result = searchInsert.searchInsert(intArrayOf(1,3,5,6),2)

        assertEquals(expected,result)
    }

    @Test
    fun `should return accurate search index(4) when target not found in array`(){
        val expected = 4
        val result = searchInsert.searchInsert(intArrayOf(1,3,5,6),7)

        assertEquals(expected,result)
    }

    @Test
    fun `should return accurate search index(0) when target not found in array`(){
        val expected = 0
        val result = searchInsert.searchInsert(intArrayOf(1),-1)

        assertEquals(expected,result)
    }

    @Test
    fun `should return accurate search index(0) when target found in array`(){
        val expected = 0
        val result = searchInsert.searchInsert(intArrayOf(1),1)

        assertEquals(expected,result)
    }

    @Test
    fun `should return accurate search index(1) when target not found in array`(){
        val expected = 1
        val result = searchInsert.searchInsert(intArrayOf(1),4)

        assertEquals(expected,result)
    }
}