package leetcode.challenge.`2020`.`11`.week4

// https://leetcode.com/problems/smallest-integer-divisible-by-k/
fun smallestRepunitDivByK(K: Int): Int {
    if (K % 2 == 0 || K % 5 == 0) return -1

    var remainder = 0
    for (length in 1..K) {
        remainder = (remainder * 10 + 1) % K
        if (remainder == 0) {
            return length
        }
    }
    return -1
}