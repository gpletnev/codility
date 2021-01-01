package leetcode.challenge.`2020`.`07`.week3

// https://leetcode.com/problems/reverse-words-in-a-string/
fun reverseWords(s: String): String {
    val words = s.trim().split(Regex("  *"))
    return words.reversed().joinToString(" ")
}