package problemSolving.smallerAndGreater

class Solution {
    fun solve(array: IntArray): Int {
        var max = array[0]
        var min = array[0]
        var count = 0
        for(item in array){
            if(item > max)
                max = item
            else if(item < min)
                min = item
        }
        for(item in array){
            if(item > min && item < max)
                count++
        }
        return count
    }
}
