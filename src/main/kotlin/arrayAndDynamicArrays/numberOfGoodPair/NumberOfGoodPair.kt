package arrayAndDynamicArrays.numberOfGoodPair

class NumberOfGoodPair {
    fun numIdenticalPairs(array: IntArray): Int {
        var count = 0
        val map = mutableMapOf<Int, Int>()

        array.forEach {
            count += map.getOrDefault(it, 0)
            map.put(it, map.getOrDefault(it, 0)+1)
        }

        return count
    }
}