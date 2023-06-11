package problemSolving.patternPrinting

class Solution {
    fun solve(A: Int): Array<IntArray>
    {
        val resultArray : Array<IntArray> = Array(A) { IntArray(A) { 0 } }

        for(rowIndex in resultArray.indices) for(columnIndex in resultArray[rowIndex].indices){
            if(rowIndex >= columnIndex)
                resultArray[rowIndex][columnIndex] = columnIndex+1
        }

        return resultArray
    }
}