package arrayAndDynamicArrays

import kotlin.collections.HashSet

class KDiffPair {
    fun findPairs(nums: IntArray, k: Int): Int {
        val uniqeKDiffPairs = HashSet<Pair<Int, Int>>()
        val uniqueElements = HashSet<Int>()

        for (num in nums) {
            if (uniqueElements.contains(num - k)) uniqeKDiffPairs.add(Pair(num - k, num))
            if (uniqueElements.contains(num + k)) uniqeKDiffPairs.add(Pair(num, num + k))
            uniqueElements.add(num)
        }

        return uniqeKDiffPairs.size
    }
}
