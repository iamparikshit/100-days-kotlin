package dynamicProgramming.paintingTheWalls

import kotlin.math.max
import kotlin.math.min

class PaintWall {
    fun paintWalls(cost: IntArray, time: IntArray): Int {
        val size = cost.size
        var dp = IntArray(size+1)
        var prevDp = IntArray(size+1){1_000_000_000}
        prevDp[0] = 0

        for(index in size-1 downTo 0){
            dp = IntArray(size+1)
            for(remain in 1 .. size){
                val paint = cost[index] + prevDp[max(0, remain-1-time[index])]
                val dontPaint = prevDp[remain]

                dp[remain] = min(paint, dontPaint)
            }
            prevDp = dp
        }
        return dp[size]
    }
}