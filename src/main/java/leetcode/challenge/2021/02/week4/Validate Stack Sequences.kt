package leetcode.challenge.`2021`.`02`.week4

import java.util.*

// https://leetcode.com/problems/validate-stack-sequences/
fun validateStackSequences(pushed: IntArray, popped: IntArray): Boolean {
    val stack = Stack<Int>()
    var i = 0
    for (x in pushed) {
        stack.push(x)
        while (!stack.empty() && stack.peek() == popped[i]) {
            stack.pop()
            i++
        }
    }
    return stack.empty()
}