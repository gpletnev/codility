package leetcode.challenge.`2020`.`07`.week1

import leetcode.TreeNode
import org.junit.jupiter.api.Test
import kotlin.test.assertContentEquals
import kotlin.test.assertEquals

class Test {
    @Test
    fun testArrangingCoins() {
        assertEquals(0, ArrangingCoins.arrangeCoins(0))
        assertEquals(1, ArrangingCoins.arrangeCoins(1))
        assertEquals(1, ArrangingCoins.arrangeCoins(2))
        assertEquals(2, ArrangingCoins.arrangeCoins(5))
        assertEquals(3, ArrangingCoins.arrangeCoins(8))
    }

    @Test
    fun testBinaryTreeLevelOrderTraversal_II() {
        val root = TreeNode(3)
        root.left = TreeNode(9)
        root.right = TreeNode(20)
        root.right!!.left = TreeNode(15)
        root.right!!.right = TreeNode(7)

        assertEquals("[15, 7], [9, 20], [3]", BinaryTreeLevelOrderTraversal_II.levelOrderBottom(root).joinToString())
    }

    @Test
    fun testPrisonCellsAfterNDays() {
        assertContentEquals(intArrayOf(0, 1, 1, 0, 0, 0, 0, 0), PrisonCellsAfterNDays.prisonAfterNDays(intArrayOf(0, 1, 0, 1, 1, 0, 0, 1), 1))
        assertContentEquals(intArrayOf(0, 0, 0, 0, 1, 1, 1, 0), PrisonCellsAfterNDays.prisonAfterNDays(intArrayOf(0, 1, 0, 1, 1, 0, 0, 1), 2))
        assertContentEquals(intArrayOf(0, 0, 1, 1, 0, 0, 0, 0), PrisonCellsAfterNDays.prisonAfterNDays(intArrayOf(0, 1, 0, 1, 1, 0, 0, 1), 7))
        assertContentEquals(intArrayOf(0, 0, 1, 1, 1, 1, 1, 0), PrisonCellsAfterNDays.prisonAfterNDays(intArrayOf(1, 0, 0, 1, 0, 0, 1, 0), 1000000000))
    }

    @Test
    fun testUglyNumberII() {
        assertEquals(1, UglyNumberII.nthUglyNumber(1))
        assertEquals(2, UglyNumberII.nthUglyNumber(2))
        assertEquals(3, UglyNumberII.nthUglyNumber(3))
        assertEquals(12, UglyNumberII.nthUglyNumber(10))
        assertEquals(15, UglyNumberII.nthUglyNumber(11))
    }

    @Test
    fun testHammingDistance() {
        assertEquals(2, HammingDistance.hammingDistance(1, 4))
    }

    @Test
    fun testPlusOne() {
        assertContentEquals(intArrayOf(1), `Plus One`.plusOne(intArrayOf(0)))
        assertContentEquals(intArrayOf(1, 0), `Plus One`.plusOne(intArrayOf(9)))
        assertContentEquals(intArrayOf(1, 2, 4), `Plus One`.plusOne(intArrayOf(1, 2, 3)))
        assertContentEquals(intArrayOf(9, 8, 7, 6, 5, 4, 3, 2, 1, 1), `Plus One`.plusOne(intArrayOf(9, 8, 7, 6, 5, 4, 3, 2, 1, 0)))
    }

    @Test
    fun testIslandPerimeter() {
        assertEquals(4, `Island Perimeter`.islandPerimeter(arrayOf(intArrayOf(1))))
        assertEquals(0, `Island Perimeter`.islandPerimeter(Array(3) { intArrayOf(0, 0, 0) }))
        assertEquals(4, `Island Perimeter`.islandPerimeter(arrayOf(intArrayOf(0, 0, 0), intArrayOf(0, 1, 0), intArrayOf(0, 0, 0))))
        assertEquals(12, `Island Perimeter`.islandPerimeter(arrayOf(intArrayOf(1, 1, 1), intArrayOf(1, 1, 1), intArrayOf(1, 1, 1))))
        assertEquals(16, `Island Perimeter`.islandPerimeter(arrayOf(intArrayOf(0, 1, 0, 0), intArrayOf(1, 1, 1, 0), intArrayOf(0, 1, 0, 0), intArrayOf(1, 1, 0, 0))))
    }
}