package leetcode.challenge.`2020`.`10`.week4

import leetcode.ListNode
import leetcode.TreeNode
import org.junit.jupiter.api.Test
import kotlin.test.assertContentEquals
import kotlin.test.assertEquals

class Test {
    @Test
    fun testMinDepth() {
        var root = TreeNode(3)
        root.left = TreeNode(9)
        root.right = TreeNode(20)
        root.right!!.left = TreeNode(15)
        root.right!!.right = TreeNode(7)
        assertEquals(2, minDepth(root))

        root = TreeNode(2)
        root.right = TreeNode(3)
        root.right!!.right = TreeNode(4)
        root.right!!.right!!.right = TreeNode(5)
        root.right!!.right!!.right!!.right = TreeNode(6)
        assertEquals(5, minDepth(root))
    }

    @Test
    fun find132patternTest() {
        assertEquals(false, find132pattern(intArrayOf(1, 2, 3, 4)))
        assertEquals(true, find132pattern(intArrayOf(3, 1, 4, 2)))
        assertEquals(true, find132pattern(intArrayOf(-1, 3, 2, 0)))
    }

    @Test
    fun bagOfTokensScoreTest() {
        assertEquals(0, bagOfTokensScore(intArrayOf(100), 50))
        assertEquals(1, bagOfTokensScore(intArrayOf(100, 200), 150))
        assertEquals(2, bagOfTokensScore(intArrayOf(100, 200, 300, 400), 200))
    }

    @Test
    fun winnerSquareGameTest() {
        assertEquals(false, winnerSquareGame(0))
        assertEquals(true, winnerSquareGame(1))
        assertEquals(false, winnerSquareGame(2))
        assertEquals(true, winnerSquareGame(4))
        assertEquals(false, winnerSquareGame(7))
    }

    @Test
    fun champagneTowerTest() {
        assertEquals(0.0, champagneTower(1, 1, 1), 0.01)
        assertEquals(0.5, champagneTower(2, 1, 1), 0.01)
        assertEquals(1.0, champagneTower(100000009, 33, 17), 0.01)
    }

    @Test
    fun detectCycleTestO() {
        val node = ListNode(3)
        assertEquals(null, detectCycle(node))

        node.next = ListNode(2)
        node.next!!.next = node
        assertEquals(node, detectCycle(node))

        node.next!!.next = ListNode(0)
        node.next!!.next!!.next = ListNode(-4)
        node.next!!.next!!.next!!.next = node.next

        assertEquals(node.next, detectCycle(node))
    }

    @Test
    fun summaryRangesTest() {
        assertContentEquals(arrayOf(), summaryRanges(intArrayOf()).toTypedArray())
        assertContentEquals(arrayOf("-1"), summaryRanges(intArrayOf(-1)).toTypedArray())
        assertContentEquals(arrayOf("0"), summaryRanges(intArrayOf(0)).toTypedArray())
        assertContentEquals(arrayOf("0->2", "4->5", "7"), summaryRanges(intArrayOf(0, 1, 2, 4, 5, 7)).toTypedArray())
        assertContentEquals(arrayOf("0", "2->4", "6", "8->9"), summaryRanges(intArrayOf(0, 2, 3, 4, 6, 8, 9)).toTypedArray())
    }
}