package `2-Binary-Search`

class BinarySearch {
    fun search(nums: IntArray, target: Int): Int {
        return binarySearch(nums, 0, nums.size-1, target)
    }

    private fun binarySearch(nums : IntArray, start : Int, end : Int, target : Int) : Int{
        if(end < start) return -1
        var middle = findMiddleValue(start, end);

        when{
            targetIsSameAsMiddle(nums, middle, target) -> middle
            targetIsGreaterThanMiddle(target, nums, middle) -> {middle = binarySearch(nums, middle+1, end, target)}
            targetIsSmallerThanMiddle(target, nums, middle) -> {middle = binarySearch(nums, start, middle-1, target)}
            else -> {middle = -1}
        }
        return middle
    }

    private fun findMiddleValue(start: Int, end: Int) = start + (end - start)/ 2

    private fun targetIsSameAsMiddle(nums: IntArray, middle: Int, target: Int) =
        nums[middle] == target

    private fun targetIsSmallerThanMiddle(target: Int, nums: IntArray, middle: Int) =
        target < nums[middle]

    private fun targetIsGreaterThanMiddle(target: Int, nums: IntArray, middle: Int) =
        target > nums[middle]

}