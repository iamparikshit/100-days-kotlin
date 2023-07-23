package strings.ismorphicString

class Solution {
    fun isIsomorphic(firstInput: String, secondInput: String): Boolean {
        val map = mutableMapOf<Char, Int>()
        val secondMap = mutableMapOf<Char, Int>()

        for (index in firstInput.indices) {
            if (map.containsKey(firstInput[index])) {
                map[firstInput[index]] = map.getValue(firstInput[index]) + 1
                if(secondMap.containsKey(secondInput[index])) secondMap[secondInput[index]] = secondMap.getValue(secondInput[index]) + 1
                else return false
                if(map.getValue(firstInput[index]) != secondMap.getValue(secondInput[index])) return false
            }
            else {
                map[firstInput[index]] = 1
                if(secondMap.containsKey(secondInput[index])) return false
                secondMap[secondInput[index]] =1
            }
        }

       return true
    }
}