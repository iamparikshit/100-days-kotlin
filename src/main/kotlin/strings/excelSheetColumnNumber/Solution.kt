package strings.excelSheetColumnNumber

class Solution {
    fun titleToNumber(columnTitle: String): Int {
        var result = 0
        for(char in columnTitle){
            result *= ('Z' - 'A' + 1)
            result += char.toColumnNo()
        }
        return result
    }

    private fun Char.toColumnNo() : Int{
        return this - 'A' + 1
    }
}