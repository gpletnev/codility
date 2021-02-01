package leetcode.challenge.`2021`.`02`.week1

// https://leetcode.com/problems/number-of-1-bits/
fun hammingWeight(n: Int): Int {
    //return n.countOneBits()

    var weight = 0
    var n = n
    while (n != 0) {
        n = n and (n - 1)
        weight++
    }

    return weight
}