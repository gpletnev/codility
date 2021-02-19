package leetcode.challenge.`2021`.`02`.week3

// https://leetcode.com/problems/minimum-remove-to-make-valid-parentheses/
fun minRemoveToMakeValid(s: String): String {
    var closeCount = s.count { it == ')' }

    var openCount = 0
    val builder = StringBuilder()
    for (c in s) {
        if (c == '(') {
            if (openCount >= closeCount) continue
            openCount++
        } else if (c == ')') {
            closeCount--
            if (openCount == 0) continue
            openCount--
        }

        builder.append(c)
    }

    return builder.toString()
}