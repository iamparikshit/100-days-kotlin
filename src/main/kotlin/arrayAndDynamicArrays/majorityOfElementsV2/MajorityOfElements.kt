package arrayAndDynamicArrays.majorityOfElementsV2

class MajorityOfElements {
    fun majorityElement(nums: IntArray): List<Int> {
        val minimumCount : Int = (nums.size/3)+1
        val map = mutableMapOf<Int, Int> ()
        val result = mutableListOf<Int>()
        var value: Int
        nums.forEach {
            map.put(it, map.getOrDefault(it, 0)+1)
            value = map.getOrDefault(it, 0)
            if(value == minimumCount) result.add(it)
        }
        return result
    }
}