package leetcode.challenge.`2021`.`03`.week5

import java.util.*

// https://leetcode.com/problems/russian-doll-envelopes/
fun maxEnvelopes(envelopes: Array<IntArray>): Int {
    Arrays.sort(envelopes) { arr1, arr2 -> if (arr1[0] == arr2[0]) arr2[1] - arr1[1] else arr1[0] - arr2[0] }

    val dp = IntArray(envelopes.size)
    var len = 0

    for (envelope in envelopes) {
        var index = Arrays.binarySearch(dp, 0, len, envelope[1])
        if (index < 0) index = -(index + 1)
        dp[index] = envelope[1]
        if (index == len) len++
    }
    return len
}