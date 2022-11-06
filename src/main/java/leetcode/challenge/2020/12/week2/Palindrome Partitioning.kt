package leetcode.challenge.`2020`.`12`.week2

// https://leetcode.com/problems/palindrome-partitioning/
fun partition(s: String): List<List<String>> {
    val dp = Array(s.length) { BooleanArray(s.length) }
    val result: MutableList<List<String>> = mutableListOf()
    dfs(result, s, 0, ArrayList(), dp)
    return result
}

fun dfs(
    result: MutableList<List<String>>,
    s: String,
    start: Int,
    currentList: MutableList<String>,
    dp: Array<BooleanArray>
) {
    if (start >= s.length) result.add(ArrayList(currentList))

    for (end in start until s.length) {
        if (s[start] == s[end] && (end - start <= 2 || dp[start + 1][end - 1])) {
            dp[start][end] = true
            currentList.add(s.substring(start, end + 1))
            dfs(result, s, end + 1, currentList, dp)
            currentList.removeAt(currentList.size - 1)
        }
    }
}