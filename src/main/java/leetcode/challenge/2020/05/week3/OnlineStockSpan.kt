package leetcode.challenge.`2020`.`05`.week3

import java.util.*

// https://leetcode.com/problems/online-stock-span/
class StockSpanner {

    private val stack = Stack<Pair<Int, Int>>()

    fun next(price: Int): Int {
        var span = 1
        while (stack.isNotEmpty() && stack.peek().first <= price) {
            span += stack.pop().second
        }

        stack.push(Pair(price, span))

        return span
    }
}