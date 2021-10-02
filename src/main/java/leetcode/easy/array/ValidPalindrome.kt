package leetcode.easy.array

// https://leetcode.com/problems/valid-palindrome/
object ValidPalindrome {
    fun isPalindrome(s: String): Boolean {
        var start = 0
        var end = s.lastIndex
        while (start < end) {
            while (start < end && !s[start].isLetterOrDigit()) {
                start++
            }
            while (start < end && !s[end].isLetterOrDigit()) {
                end--
            }
            if (start < end && s[start].lowercaseChar() != s[end].lowercaseChar()) {
                return false
            }
            start++
            end--
        }
        return true
    }
}