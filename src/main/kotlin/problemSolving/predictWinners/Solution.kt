package problemSolving.predictWinners

class Solution {
    fun predictTheWinner(nums: IntArray): Boolean {
        var maxSumOfFirstPlayer = 0
        var maxSumOfSecondPlayer = 0

        var startIndex = 0
        var endIndex = nums.size-1
        var index = 0
        while(startIndex < endIndex){
            index = if(nums[startIndex] >= nums[endIndex]) startIndex++ else endIndex--
            maxSumOfFirstPlayer += nums[index]

            index = if(nums[startIndex] >= nums[endIndex]) startIndex++ else endIndex--
            maxSumOfSecondPlayer += nums[index]
        }

        return maxSumOfFirstPlayer >= maxSumOfSecondPlayer
    }

}