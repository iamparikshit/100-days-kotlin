package strings.backspaceCompare

import kotlin.text.StringBuilder

class BackspaceCompare {
    fun backspaceCompare(first: String, second: String): Boolean {
        val firstResult = StringBuilder()
        val secondResult = StringBuilder()
        for(index in first.indices){
            if(index != 0 && first[index]=='#') firstResult.deleteAt(firstResult.lastIndex)
            else firstResult.append(first[index])

        }
        for(index in second.indices){
            if(index != 0 && second[index]=='#') secondResult.deleteAt(secondResult.lastIndex)
            else secondResult.append(second[index])
        }
        return firstResult.toString() == secondResult.toString()
    }
}