package leetcode.challenge.`2021`.`01`.week3

// https://leetcode.com/problems/count-sorted-vowel-strings/
fun countVowelStrings(k: Int): Int {
    return (k + 4) * (k + 3) * (k + 2) * (k + 1) / 24 //  (n+k-1)! / n! / (n-1)!

/*    val dp = IntArray(k + 1){1}

    for (i in 1..4) {
        for (j in 1..k) {
            dp[j] += dp[j - 1]
        }
    }
    return dp[k]*/
}