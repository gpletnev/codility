package leetcode.challenge.`2020`.`11`.week4

import leetcode.BinaryTree
import org.junit.jupiter.api.Test
import kotlin.test.assertContentEquals
import kotlin.test.assertEquals

class Test {
    @Test
    fun robTest() {
        var root = BinaryTree(listOf(3, 2, 3, null, 3, null, 1)).head
        assertEquals(7, rob(root))

        root = BinaryTree(listOf(3, 4, 5, 1, 3, null, 1)).head
        assertEquals(9, rob(root))
    }

    @Test
    fun calculateTest() {
        assertEquals(7, calculate("3+2*2"))
        assertEquals(1, calculate(" 3/2"))
        assertEquals(5, calculate("3+5 / 2"))
    }

    @Test
    fun smallestRepunitDivByKTest() {
        assertEquals(22, smallestRepunitDivByK(23))
        assertEquals(1, smallestRepunitDivByK(1))
        assertEquals(-1, smallestRepunitDivByK(2))
        assertEquals(3, smallestRepunitDivByK(3))
        assertEquals(16, smallestRepunitDivByK(17))
        assertEquals(-1, smallestRepunitDivByK(5))
    }

    @Test
    fun longestSubstringTest() {
        assertEquals(3, longestSubstring("aaabb", 3))
        assertEquals(5, longestSubstring("ababbc", 2))
    }

    @Test
    fun canPartitionTest() {
        assertEquals(true, canPartition(intArrayOf(1, 5, 11, 5)))
        assertEquals(false, canPartition(intArrayOf(1, 2, 3, 5)))
    }

    @Test
    fun maxSlidingWindowTest() {
        assertContentEquals(intArrayOf(1), maxSlidingWindow(intArrayOf(1), 1))
        assertContentEquals(intArrayOf(1, -1), maxSlidingWindow(intArrayOf(1, -1), 1))
        assertContentEquals(intArrayOf(11), maxSlidingWindow(intArrayOf(9, 11), 2))
        assertContentEquals(intArrayOf(4), maxSlidingWindow(intArrayOf(4, -2), 2))
        assertContentEquals(intArrayOf(3, 3, 5, 5, 6, 7), maxSlidingWindow(intArrayOf(1, 3, -1, -3, 5, 3, 6, 7), 3))
    }
}