package leetcode.challenge.`2021`.`02`.week4

// https://leetcode.com/problems/score-of-parentheses/
fun scoreOfParentheses(S: String): Int {
    var ans = 0
    var bal = 0
    for (i in S.indices) {
        if (S[i] == '(') {
            bal++
        } else {
            bal--
            if (S[i - 1] == '(') ans += 1 shl bal
        }
    }

    return ans
}