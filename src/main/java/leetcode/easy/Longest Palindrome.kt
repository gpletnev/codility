package leetcode.easy

// https://leetcode.com/problems/longest-palindrome
fun longestPalindrome(s: String): Int {
    val set = mutableSetOf<Char>()
    var count = 0
    for(c in s) {
        if (set.contains(c)) {
            set.remove(c)
            count+=2
        } else set.add(c)
    }
    return if (set.size <= 1) s.length else count + 1
}