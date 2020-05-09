package leetcode.challenge.may2020.week2

// https://leetcode.com/problems/valid-perfect-square/
object ValidPerfectSquare {
    fun isPerfectSquare(num: Int): Boolean {

        var left = 1
        var right = num
        while (left <= right) {
            val mid = left + (right - left) / 2
            val res = num / mid
            val remain = num % mid
            if (res == mid && remain == 0) return true
            if (res > mid) {
                left = mid + 1
            } else {
                right = mid - 1
            }
        }

        return false
    }
}