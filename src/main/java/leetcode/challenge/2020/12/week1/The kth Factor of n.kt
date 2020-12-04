package leetcode.challenge.`2020`.`12`.week1

// https://leetcode.com/problems/the-kth-factor-of-n/
fun kthFactor(n: Int, _k: Int): Int {
    var k = _k
    var i = 1

    while (i * i <= n) {
        if (n % i == 0 && --k == 0) return i
        ++i
    }

    while (i > 1) {
        --i
        if (i * i == n) continue
        if (n % i == 0 && --k == 0) return n / i
    }

    return -1
}