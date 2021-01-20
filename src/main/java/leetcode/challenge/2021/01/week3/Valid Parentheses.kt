package leetcode.challenge.`2021`.`01`.week3

import java.util.*

// https://leetcode.com/problems/valid-parentheses/solution/
fun isValid(s: String): Boolean {
    if (s.length % 2 != 0) return false
    val map = mapOf('(' to ')', '{' to '}', '[' to ']')
    val stack = Stack<Char>()

    s.forEach {
        when {
            map.contains(it) -> stack.push(it)
            stack.isEmpty() -> return false
            map[stack.pop()] != it -> return false
        }
    }
    return stack.isEmpty()
}