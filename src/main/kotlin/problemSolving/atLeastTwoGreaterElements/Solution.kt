package problemSolving.atLeastTwoGreaterElements

class Solution {
    fun solve(array: IntArray): IntArray {
        var max=-99999999
        var subMax = -99999999
        for(item in array){
            if(item > max){
                subMax = max
                max = item
            }
            else if(item > subMax){
                subMax = item
            }
        }
        val list: MutableList<Int> = array.toMutableList()
        for(value in array){
            if(value == max || value == subMax)
            {
                list.remove(value)
            }
        }
        return list.toIntArray()
    }
}