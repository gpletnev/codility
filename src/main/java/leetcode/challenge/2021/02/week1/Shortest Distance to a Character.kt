package leetcode.challenge.`2021`.`02`.week1

// https://leetcode.com/problems/shortest-distance-to-a-character/
fun shortestToChar(s: String, c: Char): IntArray {
    val answer = IntArray(s.length)
    var prev = Int.MIN_VALUE / 2
    for (i in 0..s.lastIndex) {
        if (s[i] == c) prev = i
        answer[i] = i - prev
    }
    prev = Int.MAX_VALUE / 2
    for (i in s.lastIndex downTo 0) {
        if (s[i] == c) prev = i
        answer[i] = minOf(answer[i], prev - i)
    }
    return answer
}