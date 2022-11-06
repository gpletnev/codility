package leetcode.challenge.`2021`.`04`.week3

import org.junit.jupiter.api.Test
import kotlin.test.assertEquals

class Test {
    @Test
    fun fibTest() {
        assertEquals(1, fib(2))
        assertEquals(2, fib(3))
        assertEquals(3, fib(4))
    }

    @Test
    fun removeDuplicatesTest() {
        assertEquals("abcd", removeDuplicates("abcd", 2))
        assertEquals("aa", removeDuplicates("deeedbbcccbdaa", 3))
        assertEquals("ps", removeDuplicates("pbbcggttciiippooaais", 2))
    }
}