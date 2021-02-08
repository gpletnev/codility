package leetcode.challenge.`2021`.`02`.week2

import org.junit.Assert
import org.junit.Test

class Test {
    @Test
    fun peekingIteratorTest() {
        val iterator = listOf(1, 2, 3).iterator()
        val peekingIterator = PeekingIterator(iterator)

        Assert.assertEquals(1, peekingIterator.next())
        Assert.assertEquals(2, peekingIterator.peek())
        Assert.assertEquals(2, peekingIterator.next())
        Assert.assertEquals(3, peekingIterator.next())
        Assert.assertEquals(false, peekingIterator.hasNext())
    }
}