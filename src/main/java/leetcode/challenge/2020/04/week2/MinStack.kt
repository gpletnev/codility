package leetcode.challenge.`2020`.`04`.week2

import java.util.*

// https://leetcode.com/problems/min-stack/
class MinStack {

    private val stack = Stack<Long>()
    private var min: Int? = null

    fun push(x: Int) {
        if (stack.isEmpty()) {
            stack.push(x.toLong())
            min = x
            return
        }

        if (x < min!!) {
            stack.push(2 * x.toLong() - min!!)
            min = x
        } else
            stack.push(x.toLong())
    }

    fun pop() {
        val top = stack.pop()
        if (top < min!!) {
            min = (2.toLong() * min!! - top).toInt()
        }
    }

    fun top(): Int {
        val top = stack.peek()
        return if (top < min!!)
            min!!
        else top.toInt()
    }

    fun getMin(): Int {
        return min!!
    }
}