package binarySearch

class SquareRoot {
    fun mySqrt(number: Int): Int {
        if(number > 1) return getSquareRoot((number).toLong(), 0, number.toLong())
        return number
    }

    private tailrec fun getSquareRoot(target: Long, left: Long, right: Long): Int {
        val mid = (left + right) / 2
        val square = mid * mid

        return when {
            mid < left || mid > right || square == target -> mid.toInt()
            square > target -> getSquareRoot(target, left, mid - 1)
            else -> getSquareRoot(target, mid + 1, right)
        }
    }
}


