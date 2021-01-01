package leetcode.challenge.`2020`.`04`.week4

object LongestCommonSubsequence {
    fun longestCommonSubsequence(text1: String, text2: String): Int {
        val m = text1.length
        val n = text2.length

        if (m < n) return longestCommonSubsequence(text2, text1)

        val memo = IntArray(n + 1)

        for (i in 1..m) {
            var prev = 0
            for (j in 1..n) {
                val temp = memo[j]
                if (text1[i - 1] == text2[j - 1]) {
                    memo[j] = prev + 1
                } else {
                    memo[j] = Math.max(memo[j], memo[j - 1])
                }
                prev = temp
            }
        }
        return memo[n]
    }
}