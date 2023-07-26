package problemSolving.minimumTimeToArriveOnTime

import kotlin.math.ceil

class Solution {
    fun minSpeedOnTime(totalDistance: IntArray, hour: Double): Int {
        if (totalDistance.size - 1 > hour) return -1
        var minSpeed = 1
        var flag = true
        var timeRequired: Double

        while (flag) {
            timeRequired = 0.0
            for (element in totalDistance) {
                timeRequired = ceil(timeRequired)
                timeRequired += (element.toDouble() / minSpeed)
            }
            if (timeRequired <= hour) flag = false else minSpeed++
        }
        return minSpeed
    }

    fun minSpeedOnTimeUsingBinarySearch(totalDistance: IntArray, hour: Double): Int {
        var minPossibleSpeed = 1
        var maxPossibleSpeed = 10000000
        var minSpeedOnTime = -1
        var midSpeed: Int

        while (minPossibleSpeed <= maxPossibleSpeed) {
            midSpeed = (minPossibleSpeed + maxPossibleSpeed) / 2

            if (totalDistance.timeRequiredWithSpeed(midSpeed) <= hour) {
                minSpeedOnTime = midSpeed
                maxPossibleSpeed = midSpeed - 1
            } else {
                minPossibleSpeed = midSpeed + 1
            }
        }

        return minSpeedOnTime
    }

    private fun IntArray.timeRequiredWithSpeed(speed : Int) : Double {
        var timeRequired = 0.0
        for (distance in this) {
            timeRequired = ceil(timeRequired)
            timeRequired += distance.toDouble() / speed
        }
        return timeRequired
    }
}
