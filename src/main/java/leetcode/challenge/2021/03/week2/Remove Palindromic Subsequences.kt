package leetcode.challenge.`2021`.`03`.week2

// https://leetcode.com/problems/remove-palindromic-subsequences/
fun removePalindromeSub(s: String): Int {
    return if (s.isEmpty()) 0 else if (s == s.reversed()) 1 else 2
}