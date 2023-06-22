package arrayAndDynamicArrays.fizzBuzz

class Solution {
    fun fizzBuzz(input: Int): Array<String> {
        val resultArray = Array(input) { "0" }
        var sampleString: String

        for(index in 1..input){
            sampleString = ""
            if(index%3==0) sampleString="Fizz"
            if(index%5==0) sampleString="${sampleString}Buzz"
            if(sampleString.isEmpty()) sampleString=index.toString()
            resultArray[index-1]=sampleString
        }
        return resultArray
    }

    fun fizzBuzzByOtherWay(input: Int): Array<String> {
        val resultArray = Array(input) { "0" }
        var sampleString: String

        for(index in 1..input){
            if(index % 15==0) sampleString = "FizzBuzz"
            else if(index%3==0) sampleString ="Fizz"
            else if(index%5==0) sampleString ="Buzz"
            else sampleString=index.toString()

            resultArray[index-1]=sampleString
        }
        return resultArray
    }
}