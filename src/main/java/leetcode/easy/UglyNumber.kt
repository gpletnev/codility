package leetcode.easy

// https://leetcode.com/problems/ugly-number/
object UglyNumber {
    fun isUgly(num: Int): Boolean {
        if (num < 1) return false
        var n = num
        for (i in 5 downTo 2) {
            while (n % i == 0)
                n /= i
        }
        return n == 1
    }
}