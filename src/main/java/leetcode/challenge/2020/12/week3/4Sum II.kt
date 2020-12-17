package leetcode.challenge.`2020`.`12`.week3

// https://leetcode.com/problems/4sum-ii/
fun fourSumCount(A: IntArray, B: IntArray, C: IntArray, D: IntArray): Int {
    val map = mutableMapOf<Int, Int>()
    for (a in A) {
        for (b in B) {
            val sum = a + b
            map[sum] = map.getOrDefault(sum, 0) + 1
        }
    }

    var count = 0
    for (c in C) {
        for (d in D) {
            val sum = c + d
            count += map.getOrDefault(-sum, 0)
        }
    }

    return count
}
