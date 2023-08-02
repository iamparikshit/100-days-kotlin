package arrayAndDynamicArrays.multipleRightRotation

class RightRotation {
    fun solve(firstArray: IntArray, secondArray: IntArray): Array<IntArray>{
        val rows = secondArray.size
        val totalColumnSize = firstArray.size
        val result = Array(rows){IntArray(totalColumnSize)}

        for(rowIndexOfSecondArray in secondArray.indices){
            for(indexInFirstArray in firstArray.indices){
                result[rowIndexOfSecondArray][indexInFirstArray] = firstArray[ (indexInFirstArray + totalColumnSize - (secondArray[rowIndexOfSecondArray] % totalColumnSize) ) % totalColumnSize]
            }
        }

        return result
    }
}