package arrayAndDynamicArrays.minCostClimbingStairs

import kotlin.math.min

class MinCostClimbingStairs {
    fun minCostClimbingStairs(cost: IntArray): Int {
        val n = cost.size +1
        val dp = IntArray(n){0}


        for(index in 2..n){
            dp[index] = min(dp[index-1]+cost[index-1], dp[index-2]+cost[index-2])
        }

        return dp[n]
    }
}