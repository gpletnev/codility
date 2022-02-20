package leetcode.easy

import leetcode.BinaryTree
import leetcode.TreeNode
import leetcode.easy.array.*
import leetcode.joinToString
import org.junit.Assert
import org.junit.Test

class Test {
    @Test
    fun testRemoveDuplicatesFromSortedArray() {
        Assert.assertEquals(2, removeDuplicates(listOf(1, 1, 2).toIntArray()))
        Assert.assertEquals(5, removeDuplicates(listOf(0, 0, 1, 1, 1, 2, 2, 3, 3, 4).toIntArray()))
    }

    @Test
    fun testBestTimeToBuyAndSellStock() {
        Assert.assertEquals(5, BestTimeToBuyAndSellStock.maxProfit(listOf(7, 1, 5, 3, 6, 4).toIntArray()))
        Assert.assertEquals(4, BestTimeToBuyAndSellStock.maxProfit(listOf(1, 2, 3, 4, 5).toIntArray()))
        Assert.assertEquals(0, BestTimeToBuyAndSellStock.maxProfit(listOf(7, 6, 4, 3, 1).toIntArray()))
        Assert.assertEquals(0, BestTimeToBuyAndSellStock.maxProfit(IntArray(0)))
    }

    @Test
    fun testBestTimeToBuyAndSellStockII() {
        Assert.assertEquals(7, BestTimeToBuyAndSellStockII.maxProfit(listOf(7, 1, 5, 3, 6, 4).toIntArray()))
        Assert.assertEquals(4, BestTimeToBuyAndSellStockII.maxProfit(listOf(1, 2, 3, 4, 5).toIntArray()))
        Assert.assertEquals(0, BestTimeToBuyAndSellStockII.maxProfit(listOf(7, 6, 4, 3, 1).toIntArray()))
    }

    @Test
    fun testValidPalindrome() {
        Assert.assertTrue(ValidPalindrome.isPalindrome("A man, a plan, a canal: Panama"))
        Assert.assertFalse(ValidPalindrome.isPalindrome("race a car"))
    }

    @Test
    fun testUglyNumber() {
        Assert.assertEquals(true, UglyNumber.isUgly(6))
        Assert.assertEquals(true, UglyNumber.isUgly(8))
        Assert.assertEquals(false, UglyNumber.isUgly(14))
        Assert.assertEquals(true, UglyNumber.isUgly(1))
    }

    @Test
    fun testTwoSum() {
        Assert.assertArrayEquals(intArrayOf(0, 1), twoSum(intArrayOf(2, 7, 11, 15), 9))
    }

    @Test
    fun testHeightChecker() {
        Assert.assertEquals(3, heightChecker(intArrayOf(1, 1, 4, 2, 1, 3)))
        Assert.assertEquals(5, heightChecker(intArrayOf(5, 1, 2, 3, 4)))
        Assert.assertEquals(0, heightChecker(intArrayOf(1, 2, 3, 4, 5)))
    }

    @Test
    fun testIsLongPressedName() {
        Assert.assertEquals(false, isLongPressedName("alex", "alexxr"))
        Assert.assertEquals(true, isLongPressedName("alex", "aaleex"))
        Assert.assertEquals(false, isLongPressedName("saeed", "ssaaedd"))
        Assert.assertEquals(true, isLongPressedName("leelee", "lleeelee"))
        Assert.assertEquals(true, isLongPressedName("laiden", "laiden"))
    }

    @Test
    fun testIsOneBitCharacter() {
        Assert.assertEquals(true, isOneBitCharacter(intArrayOf(1, 1, 0)))
        Assert.assertEquals(false, isOneBitCharacter(intArrayOf(1, 1, 1, 0)))
    }

    @Test
    fun testKthLargest() {
        val kthLargest = KthLargest(3, intArrayOf(4, 5, 8, 2))
        Assert.assertEquals(4, kthLargest.add(3))
        Assert.assertEquals(5, kthLargest.add(5))
        Assert.assertEquals(5, kthLargest.add(10))
        Assert.assertEquals(8, kthLargest.add(9))
        Assert.assertEquals(8, kthLargest.add(4))
    }

    @Test
    fun testArrayQuickSort() {
        val array = intArrayOf(2, 4, 7, 3, 6, 6, 5, 1, 0)
        ArrayQuickSort.quickSort(array)
        Assert.assertArrayEquals(intArrayOf(0, 1, 2, 3, 4, 5, 6, 6, 7), array)
    }

    @Test
    fun testFloodFill() {
        Assert.assertArrayEquals(
            arrayOf(intArrayOf(2, 2, 2), intArrayOf(2, 2, 0), intArrayOf(2, 0, 1)),
            floodFill(arrayOf(intArrayOf(1, 1, 1), intArrayOf(1, 1, 0), intArrayOf(1, 0, 1)), 0, 0, 2)
        )
        Assert.assertArrayEquals(
            arrayOf(intArrayOf(2, 2, 2), intArrayOf(2, 2, 2)),
            floodFill(arrayOf(intArrayOf(0, 0, 0), intArrayOf(0, 0, 0)), 0, 0, 2)
        )
    }

    @Test
    fun testMergeTrees() {
        var root1: TreeNode? = TreeNode(1)
        var root2 = BinaryTree(listOf(1, 2)).head
        Assert.assertEquals("2, 2", mergeTrees(root1, root2).joinToString())

        root1 = BinaryTree(listOf(1, 3, 2, 5)).head
        root2 = BinaryTree(listOf(2, 1, 3, null, 4, null, 7)).head
        Assert.assertEquals("3, 4, 5, 5, 4, null, 7", mergeTrees(root1, root2).joinToString())
    }
}