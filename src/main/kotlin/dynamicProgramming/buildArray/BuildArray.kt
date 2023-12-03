package dynamicProgramming.buildArray

class BuildArray {

    fun numOfArrays(n: Int, m: Int, k: Int): Int {
        val dp = Array(n+1) { Array(m+1) { IntArray(k+1) } }
        val mod = 1_000_000_00_7
        var ans : Int
        for(index in 0 until  dp[0].size)
        {
            dp[n][index][0] = 1
        }

        for(index in n-1 downTo 0){
            for(maxSoFar in m downTo 0){
                for(remain in 0 .. k){
                    ans = 0

                    for(num in 1 .. maxSoFar){
                        ans = (ans + dp[index+1][maxSoFar][remain]) % mod
                    }

                    if(remain > 0){
                        for(num in maxSoFar+1 .. m){
                            ans = (ans + dp[index+1][num][remain-1]) % mod
                        }
                    }
                    dp[index][maxSoFar][remain] = ans
                }
            }
        }
        return dp[0][0][k]
    }
}