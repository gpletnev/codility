package leetcode.challenge.`2020`.`07`.week2

import leetcode.TreeNode
import org.junit.jupiter.api.Test
import kotlin.test.assertContentEquals
import kotlin.test.assertEquals

class Test {
    @Test
    fun test3Sum() {
        var actual = threeSum(intArrayOf(-1, 0, 1, 2, -1, -4))
        assertContentEquals(intArrayOf(-1, -1, 2), actual[0].toIntArray())
        assertContentEquals(intArrayOf(-1, 0, 1), actual[1].toIntArray())

        actual = threeSum(intArrayOf(0, 0, 0))
        assertContentEquals(intArrayOf(0, 0, 0), actual[0].toIntArray())

        actual = threeSum(intArrayOf(-2, 0, 0, 2, 2))
        assertContentEquals(intArrayOf(-2, 0, 2), actual[0].toIntArray())
    }

    @Test
    fun testMaximumWidthOfBinaryTree() {
        val root = TreeNode(1)
        root.left = TreeNode(2)
        root.left!!.left = TreeNode(3)
        root.left!!.right = TreeNode(4)
        assertEquals(2, widthOfBinaryTree(root))

        root.right = TreeNode(5)
        root.right!!.right = TreeNode(6)
        assertEquals(4, widthOfBinaryTree(root))

        root.left!!.right = null
        root.right!!.right = null
        assertEquals(2, widthOfBinaryTree(root))

        root.left!!.left!!.left = TreeNode(7)
        root.right!!.right = TreeNode(6)
        root.right!!.right!!.right = TreeNode(8)
        assertEquals(8, widthOfBinaryTree(root))
    }

    @Test
    fun testSubset() {
        assertEquals(
                listOf(
                        listOf(),
                        listOf(3),
                        listOf(2),
                        listOf(2, 3),
                        listOf(1),
                        listOf(1, 3),
                        listOf(1, 2),
                        listOf(1, 2, 3)
                ).joinToString(),
                subsets(intArrayOf(1, 2, 3)).joinToString()
        )
    }

    @Test
    fun testSameTree() {
        val p = TreeNode(1)
        p.left = TreeNode(2)

        val q = TreeNode(1)
        q.right = TreeNode(2)
        assertEquals(false, isSameTree(p, q))

        q.left = TreeNode(2)
        p.right = TreeNode(3)
        q.right = TreeNode(3)
        assertEquals(true, isSameTree(p, q))

        p.left = TreeNode(2)
        q.left = TreeNode(1)
        q.right = TreeNode(1)
        q.right = TreeNode(2)
        assertEquals(false, isSameTree(p, q))
    }

    @Test
    fun testAngleClock() {
        assertEquals(85.0, angleClock(11, 10), 0.00001)
        assertEquals(76.5, angleClock(1, 57), 0.00001)
        assertEquals(165.0, angleClock(12, 30), 0.00001)
        assertEquals(75.0, angleClock(3, 30), 0.00001)
        assertEquals(7.5, angleClock(3, 15), 0.00001)
        assertEquals(155.0, angleClock(4, 50), 0.00001)
        assertEquals(0.0, angleClock(12, 0), 0.00001)
    }
}