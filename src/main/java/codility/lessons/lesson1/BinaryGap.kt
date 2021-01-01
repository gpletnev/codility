package codility.lessons.lesson1

object BinaryGap {
    @JvmStatic
    fun solution(N: Int): Int {
        var current = 0
        var longest = 0
        var number = N
        while (number and 1 == 0) number = number ushr 1
        while (number > 0) {
            number = number ushr 1
            val bit = number and 1
            if (bit == 0) {
                current++
            } else {
                longest = maxOf(longest, current)
                current = 0
            }
        }
        return longest
    }
}