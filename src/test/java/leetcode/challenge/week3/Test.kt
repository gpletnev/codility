package leetcode.challenge.week3

import leetcode.challenge.week3.ConstructBinarySearchTreeFromPreorderTraversal.bstFromPreorder
import leetcode.challenge.week3.MinimumPathSum.minPathSum
import leetcode.challenge.week3.NumberOfIslands.numIslands
import leetcode.challenge.week3.ProductOfArrayExceptSelf.productExceptSelf
import leetcode.challenge.week3.SearchInRotatedSortedArray.search
import leetcode.challenge.week3.ValidParenthesisString.checkValidString
import org.junit.Assert
import org.junit.Test

class Test {

    @Test
    fun testProductExceptSelf() {
        Assert.assertArrayEquals(listOf(24, 12, 8, 6).toIntArray(), productExceptSelf(listOf(1, 2, 3, 4).toIntArray()))
        Assert.assertArrayEquals(listOf(0, 0).toIntArray(), productExceptSelf(listOf(0, 0).toIntArray()))
    }

    @Test
    fun testCheckValidString() {
        Assert.assertEquals(true, checkValidString("()"))
        Assert.assertEquals(false, checkValidString(")("))
        Assert.assertEquals(false, checkValidString("(("))
        Assert.assertEquals(true, checkValidString("(*)"))
        Assert.assertEquals(true, checkValidString("((*)"))
        Assert.assertEquals(true, checkValidString("(*))"))
    }

    @Test
    fun testNumberOfIslands() {
        Assert.assertEquals(1, numIslands(listOf("11110".toCharArray(), "11010".toCharArray(), "11000".toCharArray(), "00000".toCharArray()).toTypedArray()))
        Assert.assertEquals(3, numIslands(listOf("11000".toCharArray(), "11000  ".toCharArray(), "00100".toCharArray(), "00011".toCharArray()).toTypedArray()))
    }

    @Test
    fun testMinimumPathSum() {
        Assert.assertEquals(1, minPathSum(listOf(intArrayOf(1)).toTypedArray()))
        Assert.assertEquals(3, minPathSum(listOf(intArrayOf(1, 2)).toTypedArray()))
        Assert.assertEquals(7, minPathSum(listOf(intArrayOf(1, 3, 1), intArrayOf(1, 5, 1), intArrayOf(4, 2, 1)).toTypedArray()))
    }

    @Test
    fun testSearchInRotatedSortedArray() {
        Assert.assertEquals(4, search(intArrayOf(4, 5, 6, 7, 0, 1, 2), 0))
        Assert.assertEquals(-1, search(intArrayOf(4, 5, 6, 7, 0, 1, 2), 3))
    }

    @Test
    fun testConstructBinarySearchTreeFromPreorderTraversal() {
        Assert.assertEquals(8, bstFromPreorder(intArrayOf(8, 5, 1, 7, 10, 12))?.`val`)
    }
}