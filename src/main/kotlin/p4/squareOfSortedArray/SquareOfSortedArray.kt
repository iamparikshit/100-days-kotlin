package p4.squareOfSortedArray

class SquareOfSortedArray {
    fun sortedSquares(nums: IntArray): IntArray {
        return nums.map {  it * it }
            .sorted()
            .toIntArray()
    }
}
//question : https://leetcode.com/problems/squares-of-a-sorted-array/
//below is one of the best ans
//https://leetcode.com/problems/squares-of-a-sorted-array/discuss/1088214/Kotlin-simple