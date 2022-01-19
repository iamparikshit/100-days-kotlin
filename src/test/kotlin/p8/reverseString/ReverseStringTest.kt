package p8.reverseString

import org.junit.jupiter.api.Test
import kotlin.test.assertEquals

class ReverseStringTest {

    private val reverseString = ReverseString()

    @Test
    fun `should retun the array`() {
        val inputCharArray = charArrayOf('a','b','b','a')
        val result = reverseString.reverseString(inputCharArray)
        val expectedCharArray =  charArrayOf('a','b','b','a')

        assertEquals(expectedCharArray.toList(),result.toList())
    }

    @Test
    fun `should retun the array when in different sequence`() {
        val inputCharArray = charArrayOf('a','b','c','d')
        val result = reverseString.reverseString(inputCharArray)
        val expectedCharArray =  charArrayOf('d','c','b','a')

        assertEquals(expectedCharArray.toList(),result.toList())
    }

    @Test
    fun `should retun the array in reverse of hello`() {
        val inputCharArray = charArrayOf('h','e','l','l','o')
        reverseString.reverseStringByExtraSpace(inputCharArray)
        val expectedCharArray =  charArrayOf('o','l','l','e','h')

        assertEquals(expectedCharArray.toList(),inputCharArray.reversedArray().toList())
    }
}