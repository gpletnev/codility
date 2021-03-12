package leetcode.challenge.`2021`.`03`.week2

// https://leetcode.com/problems/check-if-a-string-contains-all-binary-codes-of-size-k/
fun hasAllCodes(s: String, k: Int): Boolean {
    val seen = mutableSetOf<String>()
    val need = 1 shl k
    var i = k
    while (i <= s.length && seen.size < need) {
        seen.add(s.substring(i - k, i))
        ++i
    }

    return seen.size == need
}