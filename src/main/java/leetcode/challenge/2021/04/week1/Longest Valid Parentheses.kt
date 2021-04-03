package leetcode.challenge.`2021`.`04`.week1

// https://leetcode.com/problems/longest-valid-parentheses/
fun longestValidParentheses(s: String): Int {
    var left = 0
    var right = 0
    var maxlength = 0
    for (i in s.indices) {
        if (s[i] == '(') {
            left++
        } else {
            right++
        }
        if (left == right) {
            maxlength = Math.max(maxlength, 2 * right)
        } else if (right >= left) {
            right = 0
            left = right
        }
    }
    left = 0.also { right = it }
    for (i in s.lastIndex downTo 0) {
        if (s[i] == '(') {
            left++
        } else {
            right++
        }
        if (left == right) {
            maxlength = Math.max(maxlength, 2 * left)
        } else if (left >= right) {
            right = 0
            left = right
        }
    }
    return maxlength
}