package problemSolving.minimumTimeToArriveOnTime

import kotlin.math.ceil

class Solution {
    fun minSpeedOnTime(dist: IntArray, hour: Double): Int {
        if (dist.size - 1 > hour) return -1
        var speed = 1
        var flag = true
        var time: Double
        while (flag) {
            time = 0.0
            for (element in dist) {
                time = ceil(time)
                time += (element.toDouble() / speed)
            }
            if (time <= hour) {
                flag = false
            } else speed++
        }
        return speed
    }

    fun minSpeedOnTimeUsingBinarySearch(dist: IntArray, hour: Double): Int {
        var minPossibleSpeed = 1
        var maxPossibleSpeed = 10000000
        var minSpeedOnTime = -1
        var mid: Int

        while (minPossibleSpeed <= maxPossibleSpeed) {
            mid = (minPossibleSpeed + maxPossibleSpeed) / 2

            if (timeRequired(dist, mid) <= hour) {
                minSpeedOnTime = mid
                maxPossibleSpeed = mid - 1
            } else {
                minPossibleSpeed = mid + 1
            }
        }

        return minSpeedOnTime
    }

    private fun timeRequired(dist: IntArray, speed: Int): Double {
        var time = 0.0
        for (element in dist) {
            time = ceil(time)
            time += element.toDouble() / speed
        }
        return time
    }
}
