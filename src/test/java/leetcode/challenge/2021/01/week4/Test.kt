package leetcode.challenge.`2021`.`01`.week4

import org.junit.Assert
import org.junit.Test

class Test {
    @Test
    fun mostCompetitiveTest() {
        Assert.assertFalse(closeStrings("abbzzca", "babzzcz"))
        Assert.assertTrue(closeStrings("abc", "bca"))
        Assert.assertFalse(closeStrings("a", "aa"))
        Assert.assertTrue(closeStrings(word1 = "cabbba", word2 = "abbccc"))
        Assert.assertFalse(closeStrings(word1 = "cabbba", word2 = "aabbss"))
    }
}