package leetcode.easy

// https://leetcode.com/problems/reverse-words-in-a-string-iii/
fun reverseWords(s: String): String {
    return s.splitToSequence(" ").map { it.reversed() }.joinToString(" ")
}