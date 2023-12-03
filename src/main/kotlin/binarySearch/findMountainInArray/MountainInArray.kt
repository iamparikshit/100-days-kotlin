package binarySearch.findMountainInArray

class MountainInArray {

    fun findInMountainArray(target: Int, mountainArr: IntArray): Int {
        //find peak index
        //then check left part if that is present
        //then check right part if that is present

        var left = 0
        var right = mountainArr.size-1
        var mid : Int
        var peakIndex = 0
        while(left < right){
            mid = left + (right-left)/2
            if(mountainArr.get(mid) < mountainArr.get(mid+1)) left = mid + 1
            else right = mid
        }
        peakIndex = left

        right = peakIndex
        left = 0
        while(left <= right){
            mid = left + (right - left) /2
            if(mountainArr.get(mid) == target) return mid
            else if(mountainArr.get(mid) < target) left = mid+1
            else right = mid -1
        }

        left = peakIndex
        right = mountainArr.size-1
        while(left <= right){
            mid = left + (right - left)/2
            if(mountainArr.get(mid) == target) return mid
            else if(mountainArr.get(mid) > target) left = mid + 1
            else right = mid - 1
        }

        return -1
    }
}
