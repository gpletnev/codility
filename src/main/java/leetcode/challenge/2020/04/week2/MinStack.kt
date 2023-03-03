package leetcode.challenge.`2020`.`04`.week2

import java.util.*

// https://leetcode.com/problems/min-stack/
/*
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
}*/
 class MinStack {
    private val stack = Stack<Int>()
    private var min = Int.MAX_VALUE
    fun push(x: Int) {
        // only push the old minimum value when the current
        // minimum value changes after pushing the new value x
        if (x <= min) {
            stack.push(min)
            min = x
        }
        stack.push(x)
    }

    fun pop() {
        // if pop operation could result in the changing of the current minimum value,
        // pop twice and change the current minimum value to the last minimum value.
        if (stack.pop() == min) min = stack.pop()
    }

    fun top(): Int {
        return stack.peek()
    }

    fun getMin(): Int {
        return min
    }
}