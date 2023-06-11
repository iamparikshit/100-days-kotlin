package problemSolving.minimumPicks

class Solution {
    fun solve(A: IntArray): Int {
        var evenMax = -99999999
        var oddMin = 100000001

        for(item in A){
            if(item%2==0){
                if(item > evenMax)
                    evenMax = item
            }
            else if(item < oddMin)
                oddMin = item
        }
        return evenMax-oddMin
    }
}