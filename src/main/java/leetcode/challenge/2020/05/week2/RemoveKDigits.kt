package leetcode.challenge.`2020`.`05`.week2

import java.util.*

object RemoveKDigits {
    fun removeKdigits(num: String, k: Int): String {
        if (k == 0) return num
        if (num.length == k) return "0"

        val stack: Stack<Char> = Stack()

        var ki = k
        for (n in num) {
            while (ki > 0 && !stack.isEmpty() && stack.peek() > n) {
                stack.pop()
                ki--
            }
            if (!(stack.isEmpty() && n == '0')) stack.push(n)
        }

        while (ki > 0) {
            stack.pop()
            ki--
        }

        val result = stack.joinToString("").trimStart('0')
        return if (result.isNotEmpty()) return result else "0"
    }
}