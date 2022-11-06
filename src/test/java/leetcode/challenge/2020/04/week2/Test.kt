package leetcode.challenge.`2020`.`04`.week2

import org.junit.jupiter.api.Test
import kotlin.test.assertEquals

class Test {
    @Test
    fun testBackspaceCompare() {
        assertEquals(true, BackspaceStringCompare.backspaceCompare("ab#c", "ad#c"))
        assertEquals(true, BackspaceStringCompare.backspaceCompare("ab##", "c#d#"))
        assertEquals(true, BackspaceStringCompare.backspaceCompare("a##c", "#a#c"))
        assertEquals(false, BackspaceStringCompare.backspaceCompare("a#c", "b"))
    }

    @Test
    fun testMinStack() {
        val stack = MinStack()
        stack.push(2147483647)
        assertEquals(2147483647, stack.getMin())
        stack.push(-2147483648)
        assertEquals(-2147483648, stack.top())
        stack.pop()
        assertEquals(2147483647, stack.getMin())
    }

    @Test
    fun testLastStoneWeight() {
        assertEquals(1, LastStoneWeight.lastStoneWeight(listOf(2, 7, 4, 1, 8, 1).toIntArray()))
    }

    @Test
    fun testFindMaxLength() {
        assertEquals(2, ContiguousArray.findMaxLength(listOf(0, 1).toIntArray()))
        assertEquals(2, ContiguousArray.findMaxLength(listOf(0, 1, 0).toIntArray()))
        assertEquals(6, ContiguousArray.findMaxLength(listOf(0, 0, 1, 0, 0, 1, 1, 0).toIntArray()))
    }

    @Test
    fun testStringShift() {
        assertEquals("cab", PerformStringShifts.stringShift("abc", listOf(listOf(0, 1).toIntArray(), listOf(1, 2).toIntArray()).toTypedArray()))
        assertEquals("efgabcd", PerformStringShifts.stringShift("abcdefg", listOf(listOf(1, 1).toIntArray(), listOf(1, 1).toIntArray(), listOf(0, 2).toIntArray(), listOf(1, 3).toIntArray()).toTypedArray()))
        assertEquals("hcjwpdh", PerformStringShifts.stringShift("wpdhhcj", listOf(listOf(0, 7).toIntArray(), listOf(1, 7).toIntArray(), listOf(1, 0).toIntArray(), listOf(1, 3).toIntArray(), listOf(0, 3).toIntArray(), listOf(0, 6).toIntArray(), listOf(1, 2).toIntArray()).toTypedArray()))
    }
}