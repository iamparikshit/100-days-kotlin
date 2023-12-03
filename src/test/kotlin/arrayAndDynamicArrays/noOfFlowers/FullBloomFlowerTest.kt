package arrayAndDynamicArrays.noOfFlowers

import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

class FullBloomFlowerTest{
    private val fullBloomFlowers = FullBloomFlowers()

    @Test
    fun `should return the people who can get full bloom flowers`() {
        val expected = intArrayOf(1,2,2,2)
        val flowers = arrayOf(
            intArrayOf(1,6),
            intArrayOf(3,7),
            intArrayOf(9,12),
            intArrayOf(4,13)
        )
        val people = intArrayOf(2,3,7,11)

        val result = fullBloomFlowers.fullBloomFlowers2(flowers, people)

        assertArrayEquals(expected, result)
    }

    @Test
    fun `should return the people who can get full bloom flowers 3 3 2`() {
        val expected = intArrayOf(2,2,1)
        val flowers = arrayOf(
            intArrayOf(1,10),
            intArrayOf(3,3),
        )
        val people = intArrayOf(3,3,2)

        val result = fullBloomFlowers.fullBloomFlowers2(flowers, people)

        assertArrayEquals(expected, result)
    }
}