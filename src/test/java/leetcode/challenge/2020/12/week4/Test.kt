package leetcode.challenge.`2020`.`12`.week4

import leetcode.BinaryTree
import leetcode.toIntArray
import leetcode.toList
import org.junit.jupiter.api.Test
import kotlin.test.assertContentEquals
import kotlin.test.assertEquals
import kotlin.test.assertFalse
import kotlin.test.assertTrue

class Test {
    @Test
    fun isBalancedTest() {
        assertTrue(isBalanced(BinaryTree(listOf(3, 9, 20, null, null, 15, 7)).head))
        assertFalse(isBalanced(BinaryTree(listOf(1, 2, 2, 3, 3, null, null, 4, 4)).head))
        assertTrue(isBalanced(BinaryTree(listOf()).head))
    }

    @Test
    fun nextGreaterElementTest() {
        assertEquals(21, nextGreaterElement(12))
        assertEquals(-1, nextGreaterElement(21))
        assertEquals(12433567, nextGreaterElement(12376543))
    }

    @Test
    fun swapPairsTest() {
        assertEquals(null, swapPairs(intArrayOf().toList()))
        assertContentEquals(intArrayOf(1), swapPairs(intArrayOf(1).toList())!!.toIntArray())
        assertContentEquals(intArrayOf(2, 1, 4, 3), swapPairs(intArrayOf(1, 2, 3, 4).toList())!!.toIntArray())
    }

    @Test
    fun findDiagonalOrderTest() {
        assertContentEquals(
            intArrayOf(),
            findDiagonalOrder(arrayOf(intArrayOf()))
        )
        assertContentEquals(
            intArrayOf(1),
            findDiagonalOrder(arrayOf(intArrayOf(1)))
        )
        assertContentEquals(
            intArrayOf(1, 2, 4, 7, 5, 3, 6, 8, 9),
            findDiagonalOrder(arrayOf(intArrayOf(1, 2, 3), intArrayOf(4, 5, 6), intArrayOf(7, 8, 9)))
        )
    }

    @Test
    fun numDecodingsTest() {
        assertEquals(2, numDecodings("12"))
        assertEquals(3, numDecodings("226"))
        assertEquals(0, numDecodings("0"))
        assertEquals(1, numDecodings("1"))
    }

    @Test
    fun minJumpsTest() {
        assertEquals(3, minJumps(intArrayOf(100, -23, -23, 404, 100, 23, 23, 23, 3, 404)))
        assertEquals(0, minJumps(intArrayOf(7)))
        assertEquals(1, minJumps(intArrayOf(7, 6, 9, 6, 9, 6, 9, 7)))
        assertEquals(3, minJumps(intArrayOf(11, 22, 7, 7, 7, 7, 7, 7, 7, 22, 13)))
    }

    @Test
    fun reachNumberTest() {
        assertEquals(2, reachNumber(3))
        assertEquals(3, reachNumber(2))
    }
}