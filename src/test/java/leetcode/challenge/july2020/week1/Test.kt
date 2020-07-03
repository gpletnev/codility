package leetcode.challenge.july2020.week1

import org.junit.Assert
import org.junit.Test

class Test {
    @Test
    fun testArrangingCoins() {
        Assert.assertEquals(0, ArrangingCoins.arrangeCoins(0))
        Assert.assertEquals(1, ArrangingCoins.arrangeCoins(1))
        Assert.assertEquals(1, ArrangingCoins.arrangeCoins(2))
        Assert.assertEquals(2, ArrangingCoins.arrangeCoins(5))
        Assert.assertEquals(3, ArrangingCoins.arrangeCoins(8))
    }

    @Test
    fun testBinaryTreeLevelOrderTraversal_II() {
        val root = TreeNode(3)
        root.left = TreeNode(9)
        root.right = TreeNode(20)
        root.right!!.left = TreeNode(15)
        root.right!!.right = TreeNode(7)

        Assert.assertEquals("[15, 7], [9, 20], [3]", BinaryTreeLevelOrderTraversal_II.levelOrderBottom(root).joinToString())
    }

    @Test
    fun testPrisonCellsAfterNDays() {
        Assert.assertArrayEquals(intArrayOf(0, 1, 1, 0, 0, 0, 0, 0), PrisonCellsAfterNDays.prisonAfterNDays(intArrayOf(0, 1, 0, 1, 1, 0, 0, 1), 1))
        Assert.assertArrayEquals(intArrayOf(0, 0, 0, 0, 1, 1, 1, 0), PrisonCellsAfterNDays.prisonAfterNDays(intArrayOf(0, 1, 0, 1, 1, 0, 0, 1), 2))
        Assert.assertArrayEquals(intArrayOf(0, 0, 1, 1, 0, 0, 0, 0), PrisonCellsAfterNDays.prisonAfterNDays(intArrayOf(0, 1, 0, 1, 1, 0, 0, 1), 7))
        Assert.assertArrayEquals(intArrayOf(0, 0, 1, 1, 1, 1, 1, 0), PrisonCellsAfterNDays.prisonAfterNDays(intArrayOf(1, 0, 0, 1, 0, 0, 1, 0), 1000000000))
    }
}