package strings.excelCellInRange

class Solution {

    fun cellsInRange(inputString: String): List<String> {
        val startingColumn = inputString[0]
        val startingRow = inputString[1]
        val endingColumn = inputString[3]
        val endingRow = inputString[4]

        val result = mutableListOf<String>()

        for(column in startingColumn .. endingColumn){
            for(row in startingRow .. endingRow){
                result.add("$column$row")
            }
        }

        return result
    }
}