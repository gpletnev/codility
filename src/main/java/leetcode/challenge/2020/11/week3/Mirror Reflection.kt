package leetcode.challenge.`2020`.`11`.week3

// https://leetcode.com/problems/mirror-reflection/
fun mirrorReflection(_p: Int, _q: Int): Int {
    var p = _p
    var q = _q
    val g = gcd(p, q)
    p /= g
    p %= 2
    q /= g
    q %= 2
    if (p == 1 && q == 1) return 1
    return if (p == 1) 0 else 2
}

fun gcd(a: Int, b: Int): Int {
    return if (a == 0) b else gcd(b % a, a)
}