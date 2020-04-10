package leetcode.challenge.week2

import leetcode.challenge.week2.BackspaceStringCompare.backspaceCompare
import org.junit.Assert
import org.junit.Test

class Test {
    @Test
    fun testBackspaceCompare() {
        Assert.assertEquals(true, backspaceCompare("ab#c", "ad#c"))
        Assert.assertEquals(true, backspaceCompare("ab##", "c#d#"))
        Assert.assertEquals(true, backspaceCompare("a##c", "#a#c"))
        Assert.assertEquals(false, backspaceCompare("a#c", "b"))
    }

    @Test
    fun testMinStack() {
        val stack = MinStack()
        stack.push(2147483647)
        Assert.assertEquals(2147483647, stack.getMin())
        stack.push(-2147483648)
        Assert.assertEquals(-2147483648, stack.top())
        stack.pop()
        Assert.assertEquals(2147483647, stack.getMin())
    }
}