package `3-Search-Insert`
//https://leetcode.com/problems/search-insert-position/
class SearchInsert {
    fun searchInsert(nums: IntArray, target: Int): Int {
        var left = 0
        var right = nums.size - 1
        var middle = 0
        while (left <= right) {
            middle = left + (right - left) / 2

            when {
                targetFound(nums, middle, target) -> return middle
                targetIsLargerThanMiddle(target, nums, middle) -> { left = middle + 1 }
                taregetIsLessThanMiddle(target, nums, middle) -> { right = middle - 1 }
            }
        }
        return left
    }

    private fun taregetIsLessThanMiddle(target: Int, nums: IntArray, middle: Int) =
        target < nums[middle]

    private fun targetIsLargerThanMiddle(target: Int, nums: IntArray, middle: Int) =
        target > nums[middle]

    private fun targetFound(nums: IntArray, middle: Int, target: Int) = nums[middle] == target
}