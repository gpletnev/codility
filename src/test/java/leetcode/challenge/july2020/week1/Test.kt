package leetcode.challenge.july2020.week1

import leetcode.TreeNode
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

    @Test
    fun testUglyNumberII() {
        Assert.assertEquals(1, UglyNumberII.nthUglyNumber(1))
        Assert.assertEquals(2, UglyNumberII.nthUglyNumber(2))
        Assert.assertEquals(3, UglyNumberII.nthUglyNumber(3))
        Assert.assertEquals(12, UglyNumberII.nthUglyNumber(10))
        Assert.assertEquals(15, UglyNumberII.nthUglyNumber(11))
    }

    @Test
    fun testHammingDistance() {
        Assert.assertEquals(2, HammingDistance.hammingDistance(1, 4))
    }

    @Test
    fun testPlusOne() {
        Assert.assertArrayEquals(intArrayOf(1), `Plus One`.plusOne(intArrayOf(0)))
        Assert.assertArrayEquals(intArrayOf(1, 0), `Plus One`.plusOne(intArrayOf(9)))
        Assert.assertArrayEquals(intArrayOf(1, 2, 4), `Plus One`.plusOne(intArrayOf(1, 2, 3)))
        Assert.assertArrayEquals(intArrayOf(9, 8, 7, 6, 5, 4, 3, 2, 1, 1), `Plus One`.plusOne(intArrayOf(9, 8, 7, 6, 5, 4, 3, 2, 1, 0)))
    }

    @Test
    fun testIslandPerimeter() {
        Assert.assertEquals(4, `Island Perimeter`.islandPerimeter(arrayOf(intArrayOf(1))))
        Assert.assertEquals(0, `Island Perimeter`.islandPerimeter(Array(3) { intArrayOf(0, 0, 0) }))
        Assert.assertEquals(4, `Island Perimeter`.islandPerimeter(arrayOf(intArrayOf(0, 0, 0), intArrayOf(0, 1, 0), intArrayOf(0, 0, 0))))
        Assert.assertEquals(12, `Island Perimeter`.islandPerimeter(arrayOf(intArrayOf(1, 1, 1), intArrayOf(1, 1, 1), intArrayOf(1, 1, 1))))
        Assert.assertEquals(16, `Island Perimeter`.islandPerimeter(arrayOf(intArrayOf(0, 1, 0, 0), intArrayOf(1, 1, 1, 0), intArrayOf(0, 1, 0, 0), intArrayOf(1, 1, 0, 0))))
    }
}