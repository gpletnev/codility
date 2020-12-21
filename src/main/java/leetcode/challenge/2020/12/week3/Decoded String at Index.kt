package leetcode.challenge.`2020`.`12`.week3

// https://leetcode.com/problems/decoded-string-at-index/
fun decodeAtIndex(S: String, K: Int): String {
    var size: Long = 0
    var k: Long = K.toLong()

    // Find size = length of decoded string
    for (c in S.toCharArray()) {
        if (c.isDigit()) size *= c - '0' else size++
    }

    for (c in S.toCharArray().reversed()) {
        k %= size
        if (k == 0L && c.isLetter()) return c.toString()
        if (c.isDigit()) size /= c - '0' else size--
    }

    return ""
}