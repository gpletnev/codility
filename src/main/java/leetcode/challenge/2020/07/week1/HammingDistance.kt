package leetcode.challenge.`2020`.`07`.week1

// https://leetcode.com/problems/hamming-distance/
object HammingDistance {
    fun hammingDistance(x: Int, y: Int): Int {
        val xy = x.xor(y)
        return Integer.bitCount(xy)
    }
}