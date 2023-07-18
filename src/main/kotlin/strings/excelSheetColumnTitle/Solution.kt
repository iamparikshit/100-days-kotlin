package strings.excelSheetColumnTitle

class Solution {
    fun convertToTitle(columnNumber: Int): String {
        val columnTitle = StringBuilder()
        var result = columnNumber
        while(result > 0){
            columnTitle.append(('A' + (--result % ('Z'-'A'+1))))
            result /= 26
        }
        return columnTitle.reverse().toString()
    }
}