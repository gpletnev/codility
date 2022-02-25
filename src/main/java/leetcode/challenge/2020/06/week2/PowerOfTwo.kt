package leetcode.challenge.`2020`.`06`.week2

object PowerOfTwo {
    fun isPowerOfTwo(n: Int): Boolean {
        // return if (n > 0) Integer.bitCount(n) == 1 else false
        if (n < 1) return false
        var i = 0
        var _n = n
        while (_n != 0) {
            if (_n.and(1) == 1) i++
            if (i > 1) return false
            _n = _n.shr(1)
        }

        return i == 1
    }
}