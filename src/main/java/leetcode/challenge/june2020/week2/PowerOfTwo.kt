package leetcode.challenge.june2020.week2

object PowerOfTwo {
    fun isPowerOfTwo(n: Int) = if (n > 0) Integer.bitCount(n) == 1 else false
}