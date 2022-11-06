package leetcode.challenge.`2020`.`05`.week2

import org.junit.jupiter.api.Test
import kotlin.test.assertEquals

class Test {

    @Test
    fun testCheckIfItIsAStraightLine() {
        assertEquals(true, CheckIfItIsAStraightLine.checkStraightLine(arrayOf(intArrayOf(1, 2), intArrayOf(2, 3), intArrayOf(3, 4), intArrayOf(4, 5), intArrayOf(5, 6), intArrayOf(6, 7))))
        assertEquals(false, CheckIfItIsAStraightLine.checkStraightLine(arrayOf(intArrayOf(1, 1), intArrayOf(2, 2), intArrayOf(3, 4), intArrayOf(4, 5), intArrayOf(5, 6), intArrayOf(7, 7))))
        assertEquals(true, CheckIfItIsAStraightLine.checkStraightLine(arrayOf(intArrayOf(1, 1), intArrayOf(1, 2), intArrayOf(1, 4))))
    }

    @Test
    fun testValidPerfectSquare() {
        assertEquals(false, ValidPerfectSquare.isPerfectSquare(2147483647))
        assertEquals(true, ValidPerfectSquare.isPerfectSquare(16))
        assertEquals(false, ValidPerfectSquare.isPerfectSquare(14))
    }

    @Test
    fun testSingleElementInASortedArray() {
        assertEquals(2, SingleElementInASortedArray.singleNonDuplicate(intArrayOf(2)))
        assertEquals(2, SingleElementInASortedArray.singleNonDuplicate(intArrayOf(1, 1, 2)))
        assertEquals(2, SingleElementInASortedArray.singleNonDuplicate(intArrayOf(1, 1, 2, 3, 3)))
        assertEquals(2, SingleElementInASortedArray.singleNonDuplicate(intArrayOf(1, 1, 2, 3, 3, 4, 4, 8, 8)))
        assertEquals(10, SingleElementInASortedArray.singleNonDuplicate(intArrayOf(3, 3, 7, 7, 10, 11, 11)))
    }

    @Test
    fun testRemoveKDigits() {
        assertEquals("0", RemoveKDigits.removeKdigits(num = "10", k = 2))
        assertEquals("1219", RemoveKDigits.removeKdigits(num = "1432219", k = 3))
        assertEquals("200", RemoveKDigits.removeKdigits(num = "10200", k = 1))
        assertEquals("0", RemoveKDigits.removeKdigits(num = "10", k = 1))
    }

    @Test
    fun testTrie() {
        val trie = Trie()
        trie.insert("apple")
        assertEquals(true, trie.search("apple"))
        assertEquals(false, trie.search("app"))
        assertEquals(true, trie.startsWith("app"))
        trie.insert("app")
        assertEquals(true, trie.search("app"))
    }
}