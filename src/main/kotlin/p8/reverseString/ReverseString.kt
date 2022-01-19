package p8.reverseString

class ReverseString {
    fun reverseString(inputCharArray : CharArray) : CharArray{
        return inputCharArray.reversedArray()
    }
    fun reverseStringByExtraSpace(s: CharArray):Unit{
        var left = 0
        var right = s.size - 1

        for(i in 1..s.size/2) {
            s[left] = s[right].also {s[right] = s[left]}
            left+= 1
            right-=1
        }
    }
}