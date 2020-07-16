package leetcode.challenge.july2020.week3

import org.junit.Assert
import org.junit.Test

class Test {
    @Test
    fun testReverseWords() {
        Assert.assertEquals("world! hello", reverseWords("  hello   world!  "))
        Assert.assertEquals("blue is sky the", reverseWords("the sky is blue"))
        Assert.assertEquals("example good a", reverseWords("a good   example"))
    }

    @Test
    fun testMyPow() {
        Assert.assertEquals(1024.0, myPow(2.0, 10), 0.00001)
        Assert.assertEquals(9.261, myPow(2.1, 3), 0.00001)
        Assert.assertEquals(0.25, myPow(2.0, -2), 0.00001)
    }
}