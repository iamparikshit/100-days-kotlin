package problemSolving.singleNumber

class Solution {
    fun singleNumber(array: IntArray): Int {
        val list = mutableListOf<Int>()

        array.iterator().forEach {
            if(list.contains(it)) list.remove(it)
            else list.add(it)
        }

        return list[0]
    }
}