package strings.ismorphicString

class Solution {
    fun isIsomorphic1(firstInput: String, secondInput: String): Boolean {
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

    fun isIsomorphic(firstString: String, secondString: String): Boolean {
        val n = firstString.length
        val arr1 = IntArray(256) { -1 }
        val arr2 = IntArray(256) { -1 }
        for (i in 0..n-1) {
            val (x, y) = Pair(firstString[i].toInt(), secondString[i].toInt())
            if (arr1[x] != arr2[y]) return false
            arr1[x] = i
            arr2[y] = i
        }
        return true
    }
}