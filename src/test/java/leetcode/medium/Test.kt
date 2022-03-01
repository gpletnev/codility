package leetcode.medium

import leetcode.ListNode
import leetcode.TreeNode
import leetcode.toIntArray
import leetcode.toList
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

    @Test
    fun testRemoveNthFromEnd() {
        Assert.assertArrayEquals(
            intArrayOf(1, 2, 3, 5),
            removeNthFromEnd(intArrayOf(1, 2, 3, 4, 5).toList(), 2)!!.toIntArray()
        )
        Assert.assertArrayEquals(intArrayOf(1), removeNthFromEnd(intArrayOf(1, 2).toList(), 1)!!.toIntArray())
        Assert.assertEquals(null, removeNthFromEnd(intArrayOf(1).toList(), 1))
    }

    @Test
    fun testMaxAreaOfIsland() {
        Assert.assertEquals(0, maxAreaOfIsland(arrayOf(intArrayOf(0, 0, 0, 0))))
        Assert.assertEquals(
            6, maxAreaOfIsland(
                arrayOf(
                    intArrayOf(0, 0, 1, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0),
                    intArrayOf(0, 0, 0, 0, 0, 0, 0, 1, 1, 1, 0, 0, 0),
                    intArrayOf(0, 1, 1, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0),
                    intArrayOf(0, 1, 0, 0, 1, 1, 0, 0, 1, 0, 1, 0, 0),
                    intArrayOf(0, 1, 0, 0, 1, 1, 0, 0, 1, 1, 1, 0, 0),
                    intArrayOf(0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0),
                    intArrayOf(0, 0, 0, 0, 0, 0, 0, 1, 1, 1, 0, 0, 0),
                    intArrayOf(0, 0, 0, 0, 0, 0, 0, 1, 1, 0, 0, 0, 0)
                )
            )
        )
    }

    @Test
    fun testUpdateMatrix() {
        Assert.assertArrayEquals(
            arrayOf(intArrayOf(0, 0, 0), intArrayOf(0, 1, 0), intArrayOf(0, 0, 0)),
            updateMatrix(arrayOf(intArrayOf(0, 0, 0), intArrayOf(0, 1, 0), intArrayOf(0, 0, 0)))
        )

        Assert.assertArrayEquals(
            arrayOf(intArrayOf(0, 0, 0), intArrayOf(0, 1, 0), intArrayOf(1, 2, 1)),
            updateMatrix(arrayOf(intArrayOf(0, 0, 0), intArrayOf(0, 1, 0), intArrayOf(1, 1, 1)))
        )
    }

    @Test
    fun testOrangesRotting() {
        Assert.assertEquals(0, orangesRotting(arrayOf(intArrayOf(0, 2))))
        Assert.assertEquals(
            -1, orangesRotting(
                arrayOf(
                    intArrayOf(2, 1, 1),
                    intArrayOf(0, 1, 1),
                    intArrayOf(1, 0, 1)
                )
            )
        )
        Assert.assertEquals(
            4, orangesRotting(
                arrayOf(
                    intArrayOf(2, 1, 1),
                    intArrayOf(1, 1, 0),
                    intArrayOf(0, 1, 1)
                )
            )
        )
    }

    @Test
    fun combineTest() {
        Assert.assertEquals(listOf(listOf(1)), combine(1, 1))
        Assert.assertEquals(listOf(listOf(1, 2)), combine(2, 2))
        Assert.assertEquals(listOf(listOf(1, 2), listOf(1, 3), listOf(2, 3)), combine(3, 2))
    }

    @Test
    fun permutateTest() {
        Assert.assertEquals(listOf(listOf(1)), permute(intArrayOf(1)))
        Assert.assertEquals(listOf(listOf(0, 1), listOf(1, 0)), permute(intArrayOf(0, 1)))
        Assert.assertEquals(
            "[1, 2, 3], [1, 3, 2], [2, 1, 3], [2, 3, 1], [3, 1, 2], [3, 2, 1]",
            permute(intArrayOf(1, 2, 3)).joinToString()
        )
    }

    @Test
    fun robTest() {
        Assert.assertEquals(4, rob(intArrayOf(1, 2, 3, 1)))
        Assert.assertEquals(12, rob(intArrayOf(2, 7, 9, 3, 1)))
    }

    @Test
    fun minimumTotalTest() {
        Assert.assertEquals(11, minimumTotal(listOf(listOf(2), listOf(3, 4), listOf(6, 5, 7), listOf(4, 1, 8, 3))))
        Assert.assertEquals(-1, minimumTotal(listOf(listOf(-1))))
    }

    @Test
    fun findMinTest() {
        Assert.assertEquals(1, findMin(intArrayOf(3, 4, 5, 1, 2)))
        Assert.assertEquals(0, findMin(intArrayOf(4, 5, 6, 7, 0, 1, 2)))
        Assert.assertEquals(11, findMin(intArrayOf(11, 13, 15, 17)))
    }

    @Test
    fun findPeakElementTest() {
        Assert.assertEquals(2, findPeakElement(intArrayOf(1, 2, 3, 1)))
        Assert.assertEquals(5, findPeakElement(intArrayOf(1, 2, 1, 3, 5, 6, 4)))
    }
}