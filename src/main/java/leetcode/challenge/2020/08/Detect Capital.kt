package leetcode.challenge.`2020`.`08`

// https://leetcode.com/problems/detect-capital/
fun detectCapitalUse(word: String): Boolean {
    return Regex("[A-Z]*|.[a-z]*").matches(word)
}