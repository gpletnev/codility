package leetcode.challenge.june2020.week2

object PowerOfTwo {
    fun isPowerOfTwo(n: Int): Boolean {
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