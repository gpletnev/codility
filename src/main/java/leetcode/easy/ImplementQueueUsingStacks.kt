package leetcode.easy

import java.util.*

// https://leetcode.com/problems/implement-queue-using-stacks/
class MyQueue() {
    private val s1 = Stack<Int>()
    private val s2 = Stack<Int>()

    private var front = 0

    fun push(x: Int) {
        if (s1.empty())
            front = x
        s1.push(x)
    }

    fun pop(): Int {
        if (s2.isEmpty()) {
            while (!s1.isEmpty())
                s2.push(s1.pop())
        }
        return s2.pop()
    }

    fun peek(): Int {
        if (!s2.isEmpty()) {
            return s2.peek()
        }
        return front
    }

    fun empty(): Boolean {
        return s1.isEmpty() && s2.isEmpty()
    }

}