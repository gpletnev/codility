package leetcode.challenge.`2020`.`11`.week3

import java.util.*

// https://leetcode.com/problems/decode-string/
fun decodeString(s: String): String {
    val queue: Deque<Char> = LinkedList()
    s.toCharArray().forEach { queue.offer(it) }
    return decodeString(queue)
}

fun decodeString(queue: Deque<Char>): String {
    val sb = StringBuilder()
    var num = 0
    while (!queue.isEmpty()) {
        val c = queue.poll()
        if (Character.isDigit(c)) {
            num = num * 10 + (c - '0')
        } else if (c == '[') {
            val sub = decodeString(queue)
            repeat(num) { sb.append(sub) }
            num = 0
        } else if (c == ']') {
            break
        } else {
            sb.append(c)
        }
    }
    return sb.toString()
}