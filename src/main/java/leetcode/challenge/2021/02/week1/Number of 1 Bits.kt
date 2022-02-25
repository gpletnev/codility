package leetcode.challenge.`2021`.`02`.week1

// https://leetcode.com/problems/number-of-1-bits/
fun hammingWeight(n: Int): Int {
    //return n.countOneBits()

    var weight = 0
//    var _n = n
//    while (_n != 0) {
//        //_n = _n and (_n - 1)
//        weight++
//    }
    var _n = n.toUInt()
    while (_n > 0u) {
        if ((_n and 1u) > 0u) weight++
        _n = _n shr 1
    }
    return weight
}