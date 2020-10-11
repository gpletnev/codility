package leetcode.challenge.`2020`.`10`.week2

import java.util.*

// https://leetcode.com/problems/remove-duplicate-letters/
fun removeDuplicateLetters(s: String): String {
    val stack = Stack<Char>()
    val count = IntArray(26)
    val chars = s.toCharArray()
    for (c in chars) {
        count[c - 'a']++
    }
    val visited = BooleanArray(26)
    for (c in chars) {
        count[c - 'a']--
        if (visited[c - 'a']) {
            continue
        }
        while (!stack.isEmpty() && stack.peek() > c && count[stack.peek() - 'a'] > 0) {
            visited[stack.peek() - 'a'] = false
            stack.pop()
        }
        stack.push(c)
        visited[c - 'a'] = true
    }
    return stack.joinToString("")
}