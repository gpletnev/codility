package leetcode.challenge.`2020`.`06`.week1

import leetcode.ListNode
import leetcode.toIntArray
import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Test
import kotlin.test.assertContentEquals
import kotlin.test.assertEquals
import kotlin.test.assertTrue

class Test {
    @Test
    fun testInvertBinaryTree() {
        val root = TreeNode(4)
        root.left = TreeNode(2)
        root.right = TreeNode(7)
        root.left!!.left = TreeNode(1)
        root.left!!.right = TreeNode(3)
        root.right!!.left = TreeNode(6)
        root.right!!.right = TreeNode(9)

        InvertBinaryTree.invertTree(root)

        assertEquals(4, root.`val`)
        assertEquals(7, root.left!!.`val`)
        assertEquals(2, root.right!!.`val`)
        assertEquals(9, root.left!!.left!!.`val`)
        assertEquals(6, root.left!!.right!!.`val`)
        assertEquals(3, root.right!!.left!!.`val`)
        assertEquals(1, root.right!!.right!!.`val`)
    }

    @Test
    fun testDeleteNode() {
        val root = ListNode(4)
        root.next = ListNode(5)
        root.next!!.next = ListNode(1)
        root.next!!.next!!.next = ListNode(9)

        deleteNode(root.next)
        assertContentEquals(intArrayOf(4, 1, 9), root.toIntArray())

        deleteNode(root.next)
        assertContentEquals(intArrayOf(4, 9), root.toIntArray())
    }

    @Test
    fun testTwoCityScheduling() {
        assertEquals(
            110,
            TwoCityScheduling.twoCitySchedCost(
                listOf(
                    intArrayOf(10, 20),
                    intArrayOf(30, 200),
                    intArrayOf(400, 50),
                    intArrayOf(30, 20)
                ).toTypedArray()
            )
        )
    }

    @Test
    fun testReverseString() {
        var s = charArrayOf('h', 'e', 'l', 'l', 'o')
        ReverseString.reverseString(s)
        assertContentEquals(charArrayOf('o', 'l', 'l', 'e', 'h'), s)

        s = "Hannah".toCharArray()
        ReverseString.reverseString(s)
        assertContentEquals("hannaH".toCharArray(), s)
    }

    @Test
    fun testRandomPickWithWeight() {
        assertEquals(0, RandomPickWithWeight(intArrayOf(1)).pickIndex())

        assertTrue(RandomPickWithWeight(intArrayOf(1, 3)).pickIndex() in 0..1)
    }

    @Test
    fun testQueueReconstructionByHeight() {
        Assertions.assertArrayEquals(
            arrayOf(
                intArrayOf(5, 0),
                intArrayOf(7, 0),
                intArrayOf(5, 2),
                intArrayOf(6, 1),
                intArrayOf(4, 4),
                intArrayOf(7, 1)
            ), QueueReconstructionByHeight.reconstructQueue(
                arrayOf(
                    intArrayOf(7, 1),
                    intArrayOf(4, 4),
                    intArrayOf(7, 0),
                    intArrayOf(5, 2),
                    intArrayOf(6, 1),
                    intArrayOf(5, 0)
                )
            )
        )
    }

    @Test
    fun testCoinChange2() {
        assertEquals(4, CoinChange2.change(5, intArrayOf(1, 2, 5)))
        assertEquals(0, CoinChange2.change(3, intArrayOf(2)))
        assertEquals(1, CoinChange2.change(10, intArrayOf(10)))
    }
}