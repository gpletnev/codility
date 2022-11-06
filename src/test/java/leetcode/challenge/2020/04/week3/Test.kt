package leetcode.challenge.`2020`.`04`.week3

import leetcode.challenge.`2020`.`04`.week3.ProductOfArrayExceptSelf.productExceptSelf
import leetcode.challenge.`2020`.`04`.week3.ValidParenthesisString.checkValidString
import leetcode.challenge.`2020`.`04`.week3.NumberOfIslands.numIslands
import leetcode.challenge.`2020`.`04`.week3.MinimumPathSum.minPathSum
import leetcode.challenge.`2020`.`04`.week3.SearchInRotatedSortedArray.search
import leetcode.challenge.`2020`.`04`.week3.LeftmostColumnWithAtLeastOne.leftMostColumnWithOne
import leetcode.challenge.`2020`.`04`.week3.ConstructBinarySearchTreeFromPreorderTraversal.bstFromPreorder
import org.junit.jupiter.api.Test
import kotlin.test.assertContentEquals
import kotlin.test.assertEquals

class Test {

    @Test
    fun testProductExceptSelf() {
        assertContentEquals(listOf(24, 12, 8, 6).toIntArray(), productExceptSelf(listOf(1, 2, 3, 4).toIntArray()))
        assertContentEquals(listOf(0, 0).toIntArray(), productExceptSelf(listOf(0, 0).toIntArray()))
    }

    @Test
    fun testCheckValidString() {
        assertEquals(true, checkValidString("()"))
        assertEquals(false, checkValidString(")("))
        assertEquals(false, checkValidString("(("))
        assertEquals(true, checkValidString("(*)"))
        assertEquals(true, checkValidString("((*)"))
        assertEquals(true, checkValidString("(*))"))
    }

    @Test
    fun testNumberOfIslands() {
        assertEquals(1, numIslands(listOf("11110".toCharArray(), "11010".toCharArray(), "11000".toCharArray(), "00000".toCharArray()).toTypedArray()))
        assertEquals(3, numIslands(listOf("11000".toCharArray(), "11000  ".toCharArray(), "00100".toCharArray(), "00011".toCharArray()).toTypedArray()))
    }

    @Test
    fun testMinimumPathSum() {
        assertEquals(1, minPathSum(listOf(intArrayOf(1)).toTypedArray()))
        assertEquals(3, minPathSum(listOf(intArrayOf(1, 2)).toTypedArray()))
        assertEquals(7, minPathSum(listOf(intArrayOf(1, 3, 1), intArrayOf(1, 5, 1), intArrayOf(4, 2, 1)).toTypedArray()))
    }

    @Test
    fun testSearchInRotatedSortedArray() {
        assertEquals(4, search(intArrayOf(4, 5, 6, 7, 0, 1, 2), 0))
        assertEquals(-1, search(intArrayOf(4, 5, 6, 7, 0, 1, 2), 3))
    }

    @Test
    fun testConstructBinarySearchTreeFromPreorderTraversal() {
        assertEquals(8, bstFromPreorder(intArrayOf(8, 5, 1, 7, 10, 12))?.`val`)
    }

    @Test
    fun testLeftmostColumnWithAtLeastOne() {
        var matrix = BinaryMatrix(listOf(intArrayOf(0, 0), intArrayOf(1, 1)).toTypedArray())
        assertEquals(0, leftMostColumnWithOne(matrix))
        matrix = BinaryMatrix(listOf(intArrayOf(0, 0), intArrayOf(0, 1)).toTypedArray())
        assertEquals(1, leftMostColumnWithOne(matrix))
        matrix = BinaryMatrix(listOf(intArrayOf(0, 0), intArrayOf(0, 0)).toTypedArray())
        assertEquals(-1, leftMostColumnWithOne(matrix))
        matrix = BinaryMatrix(listOf(intArrayOf(0, 0, 0, 1), intArrayOf(0, 0, 1, 1), intArrayOf(0, 1, 1, 1)).toTypedArray())
        assertEquals(1, leftMostColumnWithOne(matrix))
    }
}