package leetcode.easy

// https://leetcode.com/problems/reverse-bits/
// you need treat n as an unsigned value
fun reverseBits(n: Int): Int {
//    var _n = n.toUInt().toString(2)
//    var rev = _n.reversed()
//    var ret = rev.toInt(2)
//    return ret

    var rev = 0u
    var _n = n.toUInt()
    for (i in 1..32) {
        if ((_n and 1u) == 1u) rev += 1u
        if (i < 32) {
            rev = rev shl 1
            _n = _n shr 1
        }
    }

    return rev.toInt()
}