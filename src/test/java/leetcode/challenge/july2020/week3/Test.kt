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
}