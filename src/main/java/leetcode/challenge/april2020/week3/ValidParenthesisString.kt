package leetcode.challenge.april2020.week3

// https://leetcode.com/problems/valid-parenthesis-string/
object ValidParenthesisString {
    fun checkValidString(s: String): Boolean {
        // the lowest and highest possible number of open left brackets
        // after processing the current character in the string
        var lowest = 0
        var highest = 0
        for (c in s.toCharArray()) {
            lowest += if (c == '(') 1 else -1
            highest += if (c != ')') 1 else -1
            if (highest < 0) break
            lowest = lowest.coerceAtLeast(0)
        }
        return lowest == 0
    }
}

