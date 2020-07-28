package leetcode.challenge.july2020.week4

// https://leetcode.com/problems/add-digits/
fun addDigits(num: Int): Int {
    val b = 10
    return if (num == 0) 0 else 1 + (num - 1) % (b - 1)
}