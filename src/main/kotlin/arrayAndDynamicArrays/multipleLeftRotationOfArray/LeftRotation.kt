package arrayAndDynamicArrays.multipleLeftRotationOfArray

class LeftRotation {
    fun solve(firstArray: IntArray, secondArray: IntArray): Array<IntArray> {
        val rows = secondArray.size
        val columns = firstArray.size

        val resultArray = Array(rows){IntArray(columns)}
        for(rowIndex in secondArray.indices){
            for(index in firstArray.indices){
                resultArray[rowIndex][index] = firstArray[(index + secondArray[rowIndex]) % columns]
            }
        }
        return resultArray
    }
}