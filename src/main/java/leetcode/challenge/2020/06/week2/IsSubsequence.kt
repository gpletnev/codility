package leetcode.challenge.`2020`.`06`.week2

// https://leetcode.com/problems/is-subsequence/
object IsSubsequence {
    fun isSubsequence(s: String, t: String): Boolean {
        if (s.length > t.length) return false

        var fromIndex = 0
        for (c in s) {
            fromIndex = t.indexOf(c, fromIndex)
            if (fromIndex == -1) {
                return false
            }
            fromIndex++
        }
        return true
    }
}