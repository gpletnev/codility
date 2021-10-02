package leetcode.challenge.`2021`.`04`.week3

// https://leetcode.com/problems/remove-all-adjacent-duplicates-in-string-ii/
fun removeDuplicates(s: String, k: Int): String {
    var i = 0
    val n = s.length
    val count = IntArray(n)
    val stack = s.toCharArray()
    var j = 0
    while (j < n) {
        stack[i] = stack[j]
        count[i] = if (i > 0 && stack[i - 1] == stack[j]) count[i - 1] + 1 else 1
        if (count[i] == k) i -= k
        ++j
        ++i
    }
    return String(stack, 0, i)
}