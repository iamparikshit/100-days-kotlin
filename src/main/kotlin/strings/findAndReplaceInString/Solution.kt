package strings.findAndReplaceInString

class Solution {
    fun findReplaceString(inputString: String, indices: IntArray, sources: Array<String>, targets: Array<String>): String {
        val result = StringBuilder().append(inputString)
        for(index in inputString.indices){
            if(index.isIndexPresent(indices)){
                result.append(inputString.isSubstringMatch(sources[index], targets[index], indices[index], result))
            }
            else result.append(inputString[index])
        }
        return result.toString()
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


}