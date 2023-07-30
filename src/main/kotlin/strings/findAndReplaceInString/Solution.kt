package strings.findAndReplaceInString

class Solution {
    fun findReplaceStringOld(inputString: String, indices: IntArray, sources: Array<String>, targets: Array<String>): String {
        val result = StringBuilder()
        val map = mutableMapOf<Int, StringOperation>()
        var count = 0

        for(index in inputString.indices){
            if(index.isIndexPresent(indices)){
                //result.append(inputString.isSubstringMatch(sources[index], targets[index], indices[index], result))
                map.put(index,StringOperation(sources[count],targets[count]))
                count++
            }
            //else result.append(inputString[index])
        }
        map.toSortedMap()
        var startIndex = 0
        while(startIndex < inputString.length){
            if(map.containsKey(startIndex)){
                inputString.isSubstringMatch(map[startIndex]!!.stringToMatch,  map[startIndex]!!.stringToReplaceWith, startIndex, result)
                startIndex += map[startIndex]!!.stringToMatch.length
            }
            else {
                result.append(inputString[startIndex])
                startIndex++
            }
        }

        return result.toString()
    }
    fun findReplaceString(s: String, indices: IntArray, sources: Array<String>, targets: Array<String>): String {
        var replacementMap = mutableMapOf<Int, Int>()

        for (i in 0 until indices.size) {
            if (s.startsWith(sources[i], indices[i])) {
                replacementMap.put(indices[i], i)
            }
        }

        var sb = StringBuilder()
        var j = 0
        while (j < s.length) {
            if (replacementMap.contains(j)) {
                var mIndex = replacementMap.get(j)!!
                sb.append(targets[mIndex])
                j += sources[mIndex].length
            }
            else {
                sb.append(s[j])
                j++
            }
        }
        return sb.toString()
    }
    private fun String.isSubstringMatch(stringToMatch: String, stringToReplaceWith: String, index : Int, result : StringBuilder) : String {
        val size = stringToMatch.length

        for(startIndex in index until size){
            if(this[startIndex] != stringToMatch[startIndex]) return ""
        }
        return result.append(stringToReplaceWith).toString()
    }

    private fun Int.isIndexPresent(indices: IntArray) : Boolean {
        for(index in indices){
            if(index == this) return true
        }
        return false
    }

    data class StringOperation(
        val stringToMatch: String,
        val stringToReplaceWith: String
    )

}