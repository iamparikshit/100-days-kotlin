package problemSolving.singleNumber

class Solution {
    fun singleNumber(array: IntArray): Int {
        val list = mutableListOf<Int>()
        for (element in array) {
            if (list.contains(element))
                list.remove(element)
            else list.add(element)
        }
        return list[0]
    }
}