package leetcode.challenge.`2021`.`03`.week2


// https://leetcode.com/problems/binary-trees-with-factors/
fun numFactoredBinaryTrees(arr: IntArray): Int {
    var res = 0L
    val mod = 1e9.toLong() + 7
    arr.sort()
    val dp = HashMap<Int, Long>()
    for (i in arr.indices) {
        dp[arr[i]] = 1L
        for (j in 0 until i)
            if (arr[i] % arr[j] == 0)
                dp[arr[i]] =
                    (dp[arr[i]]!! + dp[arr[j]]!! * dp.getOrDefault(arr[i] / arr[j], 0L)) % mod
        res = (res + dp[arr[i]]!!) % mod
    }
    return res.toInt()
}