package arrayAndDynamicArrays.maxMinusMin

class Solution {
    fun solve(array : IntArray, number : Int) : Int {
        array.sort()
        val set = mutableSetOf<Int>()
        array.map{
            set.add(it)
        }
        val size = set.size
        return set.elementAt(size-number) - set.elementAt(number-1)
    }

}