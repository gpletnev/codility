package leetcode.medium

// https://leetcode.com/problems/reverse-integer/
fun reverse(_x: Int): Int {
    var x = _x
    var result = 0

    while (x != 0) {
        val tail = x % 10
        val newResult = result * 10 + tail
        if ((newResult - tail) / 10 != result) {
            return 0
        }
        result = newResult
        x /= 10
    }

    return result
}