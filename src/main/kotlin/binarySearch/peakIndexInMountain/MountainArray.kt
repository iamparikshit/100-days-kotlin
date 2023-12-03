package binarySearch.peakIndexInMountain

class MountainArray {
    fun peakIndexInMountainArray(arr: IntArray): Int {
        var left = 0
        var right = arr.size-1
        var mid : Int
        while(left < right){
            mid = left + (right - left)/2
            if(arr[mid] < arr[mid+1]) left = mid+1
            else right = mid
        }
        return left
    }
}