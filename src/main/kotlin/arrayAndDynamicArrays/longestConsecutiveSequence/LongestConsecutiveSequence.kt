package arrayAndDynamicArrays.longestConsecutiveSequence

class LongestConsecutiveSequence {
    fun longestConsecutive(numberArray: IntArray): Int {
        val set = numberArray.toHashSet()
        var left: Int
        var right: Int
        var maxConsecutiveCount = 0

        for (num in numberArray) {
            if (set.contains(num)) {
                set.remove(num)
                left = num - 1
                right = num + 1
                while (set.contains(left)) set.remove(left--)

                while (set.contains(right)) set.remove(right++)

                if (right - left - 1 > maxConsecutiveCount) maxConsecutiveCount = right - left - 1
            }
        }
        return maxConsecutiveCount
    }
}
