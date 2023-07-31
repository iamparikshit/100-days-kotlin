package problemSolving.constructRectangle

import kotlin.math.sqrt

class ConstructRectangle {
    fun constructRectangle(area: Int): IntArray {
        var width: Int = sqrt(area.toDouble()).toInt()

        while (area % width != 0) {
            width--
        }
        return intArrayOf(area / width, width)
    }
}
