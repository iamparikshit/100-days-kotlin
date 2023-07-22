package strings.ismorphicString

class Solution {
    fun isIsomorphic(firstInput: String, secondInput: String): Boolean {
        val map = mutableMapOf<Char, Int>()
        val secondMap = mutableMapOf<Char, Int>()

        for (element in firstInput) {
            if (map.containsKey(element)) map[element] = map.getValue(element) + 1
            else map[element] = 1
        }

        for (element in secondInput) {
            if (secondMap.containsKey(element)) secondMap[element] = secondMap.getValue(element) + 1
            else secondMap[element] = 1
        }

        return map.size == secondMap.size
    }
}