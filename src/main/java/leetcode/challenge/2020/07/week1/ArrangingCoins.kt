package leetcode.challenge.`2020`.`07`.week1

// https://leetcode.com/problems/arranging-coins/
object ArrangingCoins {
    fun arrangeCoins(n: Int): Int {
        // Iterations
        var k = 1
        var remain = n
        while (remain >= k) {
            remain -= k++
        }
        return k - 1

/*        // Binary search
        var left: Long = 0
        var right = n.toLong()
        var k: Long
        var curr: Long
        while (left <= right) {
            k = left + (right - left) / 2
            curr = k * (k + 1) / 2
            if (curr == n.toLong()) return k.toInt()
            if (n.toLong() < curr) {
                right = k - 1
            } else {
                left = k + 1
            }
        }
        return right.toInt()*/

/*        // k(k+1)≤2N
        return ((sqrt(1 + (8.toDouble() * n)) - 1) / 2).toInt()*/
    }
}