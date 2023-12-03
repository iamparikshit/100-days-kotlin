package arrayAndDynamicArrays.checkIfDoubleExist

class CheckDoubleExisit {
    fun checkIfExist(arr: IntArray): Boolean {
        val set = HashSet<Int>()

        for(element in arr){
            if(set.contains(element*2) || (element%2==0 && set.contains(element/2))) return true
            else set.add(element)
        }
        return false
    }
}