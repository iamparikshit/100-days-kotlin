package arrayAndDynamicArrays.pascleTriangle

class PascleTriangle {
    fun getRow(rowIndex: Int): List<Int> {
        val list = mutableListOf<Int>()
        var prevElement : Int
        list.add(1)

        for(index in 1..rowIndex){
            prevElement = list[index-1]
            list.add((prevElement.toLong() * (rowIndex - index + 1)/ index).toInt())
        }

        return list
    }
}