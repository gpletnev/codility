package leetcode.challenge.`2021`.`02`.week4

import org.junit.Assert
import org.junit.Test

class Test {
    @Test
    fun findLongestWordTest() {
        Assert.assertEquals("apple", findLongestWord("abpcplea", listOf("ale", "apple", "monkey", "plea")))
        Assert.assertEquals("a", findLongestWord("abpcplea", listOf("a", "b", "c")))
    }
}