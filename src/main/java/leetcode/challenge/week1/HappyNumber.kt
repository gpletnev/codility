package leetcode.challenge.week1

// https://leetcode.com/problems/happy-number/
class HappyNumber {
    fun isHappy(n: Int): Boolean {
        if (n == 1 || n == 7) return true
        return if (n < 10) false else isHappy(sumOfSquaresOfDigits(n))
    }

    private fun sumOfSquaresOfDigits(nn: Int): Int {
        var n = nn
        var sum = 0
        while (n != 0) {
            val digit = n % 10
            sum += digit * digit
            n /= 10
        }
        return sum
    }
}