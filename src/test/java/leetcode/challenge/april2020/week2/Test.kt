package leetcode.challenge.april2020.week2

import leetcode.challenge.april2020.week2.BackspaceStringCompare.backspaceCompare
import leetcode.challenge.april2020.week2.ContiguousArray.findMaxLength
import leetcode.challenge.april2020.week2.LastStoneWeight.lastStoneWeight
import leetcode.challenge.april2020.week2.PerformStringShifts.stringShift
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

    @Test
    fun testLastStoneWeight() {
        Assert.assertEquals(1, lastStoneWeight(listOf(2, 7, 4, 1, 8, 1).toIntArray()))
    }

    @Test
    fun testFindMaxLength() {
        Assert.assertEquals(2, findMaxLength(listOf(0, 1).toIntArray()))
        Assert.assertEquals(2, findMaxLength(listOf(0, 1, 0).toIntArray()))
        Assert.assertEquals(6, findMaxLength(listOf(0, 0, 1, 0, 0, 1, 1, 0).toIntArray()))
    }

    @Test
    fun testStringShift() {
        Assert.assertEquals("cab", stringShift("abc", listOf(listOf(0, 1).toIntArray(), listOf(1, 2).toIntArray()).toTypedArray()))
        Assert.assertEquals("efgabcd", stringShift("abcdefg", listOf(listOf(1, 1).toIntArray(), listOf(1, 1).toIntArray(), listOf(0, 2).toIntArray(), listOf(1, 3).toIntArray()).toTypedArray()))
        Assert.assertEquals("hcjwpdh", stringShift("wpdhhcj", listOf(listOf(0, 7).toIntArray(), listOf(1, 7).toIntArray(), listOf(1, 0).toIntArray(), listOf(1, 3).toIntArray(), listOf(0, 3).toIntArray(), listOf(0, 6).toIntArray(), listOf(1, 2).toIntArray()).toTypedArray()))
    }
}