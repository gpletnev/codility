package leetcode.challenge.week4

object BitwiseANDOfNumbersRange {
    fun rangeBitwiseAnd(m: Int, n: Int): Int {
        var a = n
        while (a > m) {
            a = a.and(a - 1)
        }
        return a
    }
}