package leetcode.challenge.`2021`.`03`.week4

// https://leetcode.com/problems/palindromic-substrings/
fun countSubstrings(s: String): Int {
    if (s.isEmpty()) return 0
    var count = 0
    for (i in s.indices) {
        count += countPalindromes(s, i, i) //Count even sized
        count += countPalindromes(s, i, i + 1) //Count odd sized
    }
    return count
}

private fun countPalindromes(str: String, s: Int, e: Int): Int {
    var i = s
    var j = e
    var count = 0
    while (i >= 0 && j < str.length && str[i] == str[j]) {
        i--
        j++
        count++
    }
    return count
}