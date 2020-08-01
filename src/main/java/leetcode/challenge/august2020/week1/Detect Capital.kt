package leetcode.challenge.august2020.week1

// https://leetcode.com/problems/detect-capital/
fun detectCapitalUse(word: String): Boolean {
    return Regex("[A-Z]*|.[a-z]*").matches(word)
}