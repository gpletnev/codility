package leetcode.challenge.`2021`.`04`.week3

import org.junit.Assert
import org.junit.Test

class Test {
    @Test
    fun fibTest() {
        Assert.assertEquals(1, fib(2))
        Assert.assertEquals(2, fib(3))
        Assert.assertEquals(3, fib(4))
    }

    @Test
    fun removeDuplicatesTest() {
        Assert.assertEquals("abcd", removeDuplicates("abcd", 2))
        Assert.assertEquals("aa", removeDuplicates("deeedbbcccbdaa", 3))
        Assert.assertEquals("ps", removeDuplicates("pbbcggttciiippooaais", 2))
    }
}