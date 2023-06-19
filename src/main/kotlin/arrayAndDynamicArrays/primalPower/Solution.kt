package arrayAndDynamicArrays.primalPower

class Solution {
    fun solve(array : IntArray) : Int {
        var primeNoCount = 0
        for(element in array){
            if(element > 1 && isPrimeNumber(element)) primeNoCount++
        }
        return primeNoCount
    }

    private fun isPrimeNumber(number : Int) : Boolean {
        var index = 2
        while(index*index <= number ){
            if(number % index == 0) return false
            index++
        }
        return true
    }
}
