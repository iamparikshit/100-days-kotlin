package binarySearch.searchRange

class SearchRange {
    fun searchRange(nums: IntArray, target: Int, left : Int = 0, right : Int = nums.size): IntArray {
        val mid = left + (right-left)/2

        return if(left == right) intArrayOf(-1,-1)
        else if(nums[mid] == target){
            val lowerRange = searchRange(nums, target, left, mid)
            val upperRange = searchRange(nums, target, mid+1, right)

            val first = if(lowerRange[0] != -1) lowerRange[0] else mid
            val second = if(upperRange[1] != -1) upperRange[1] else mid
            intArrayOf(first, second)
        }
        else if (nums[mid] < target) searchRange(nums, target, mid+1, right)
        else searchRange(nums, target, left, mid)
    }
}