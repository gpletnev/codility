package leetcode.challenge.july2020.week1

// https://leetcode.com/problems/hamming-distance/
object HammingDistance {
    fun hammingDistance(x: Int, y: Int): Int {
        val xy = x.xor(y)
        return Integer.bitCount(xy)
    }
}