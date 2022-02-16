package leetcode.medium

import leetcode.TreeNode
import org.junit.Assert
import org.junit.Test

class Test {

    @Test
    fun testSearchInRotatedSortedArrayII() {
        Assert.assertEquals(true, SearchInRotatedSortedArrayII.search(intArrayOf(2, 5, 6, 0, 0, 1, 2), 0))
        Assert.assertEquals(false, SearchInRotatedSortedArrayII.search(intArrayOf(2, 5, 6, 0, 0, 1, 2), 3))
    }

    @Test
    fun testWordLadder() {
        Assert.assertEquals(5, WordLadder.ladderLength("hit", "cog", listOf("hot", "dot", "dog", "lot", "log", "cog")))
        Assert.assertEquals(0, WordLadder.ladderLength("hit", "cog", listOf("hot", "dot", "dog", "lot", "log")))
    }

    @Test
    fun testLinkedListCycleII() {
        var head = ListNode(3)
        head.next = ListNode(2)
        var next = head.next
        next!!.next = ListNode(0)
        next = head.next
        next!!.next = ListNode(-4)
        next = head.next
        next!!.next = head.next
        Assert.assertEquals(head.next, LinkedListCycleII.detectCycle(head))

        head = ListNode(1)
        head.next = ListNode(2)
        head.next!!.next = head
        Assert.assertEquals(head, LinkedListCycleII.detectCycle(head))

        head.next = null
        Assert.assertEquals(null, LinkedListCycleII.detectCycle(head))
    }

    @Test
    fun testBinaryTreeLevelOrderTraversal() {
        val root = TreeNode(3)
        root.left = TreeNode(9)
        root.right = TreeNode(20)
        root.right!!.left = TreeNode(15)
        root.right!!.right = TreeNode(7)

        Assert.assertEquals(
            "[3], [9, 20], [15, 7]",
            BinaryTreeLevelOrderTraversal.levelOrderBottom(root).joinToString()
        )
    }

    @Test
    fun testProductOfNumbers() {
        val pon = ProductOfNumbers()
        pon.add(3)
        Assert.assertEquals(3, pon.getProduct(1))
        pon.add(0)
        pon.add(2)
        pon.add(5)
        pon.add(4)
        Assert.assertEquals(20, pon.getProduct(2))
        Assert.assertEquals(40, pon.getProduct(3))
        Assert.assertEquals(0, pon.getProduct(4))
        pon.add(8)
        Assert.assertEquals(32, pon.getProduct(2))
    }

    @Test
    fun testNetworkDelayTime() {
        Assert.assertEquals(
            2,
            networkDelayTime(arrayOf(intArrayOf(2, 1, 1), intArrayOf(2, 3, 1), intArrayOf(3, 4, 1)), 4, 2)
        )
    }

    @Test
    fun testTwoSumII() {
        Assert.assertArrayEquals(intArrayOf(1, 2), twoSumII(intArrayOf(2, 7, 11, 15), 9))
        Assert.assertArrayEquals(intArrayOf(1, 3), twoSumII(intArrayOf(2, 3, 4), 6))
        Assert.assertArrayEquals(intArrayOf(1, 2), twoSumII(intArrayOf(-1, 0), -1))
    }

}