package leetcode.challenge.`2020`.`07`.week4

import leetcode.BinaryTree
import org.junit.Assert
import org.junit.Test
import java.util.*
import kotlin.collections.ArrayList

class Test {
    @Test
    fun testZigzagLevelOrder() {
        Assert.assertEquals(LinkedList<List<Int>>(), zigzagLevelOrder(null))
        val head = BinaryTree(listOf(3, 9, 20, null, null, 15, 7)).head
        Assert.assertEquals(listOf(listOf(3), listOf(20, 9), listOf(15, 7)), zigzagLevelOrder(head))
    }

    @Test
    fun testSingleNumberIII() {
        Assert.assertArrayEquals(intArrayOf(3, 5), singleNumber(intArrayOf(1, 2, 1, 3, 2, 5)))
    }

    @Test
    fun testAllPathsSourceTarget() {
        Assert.assertEquals(ArrayList<ArrayList<Int>>(), allPathsSourceTarget(arrayOf(intArrayOf(), intArrayOf())))
        Assert.assertEquals(listOf(listOf(0, 1)), allPathsSourceTarget(arrayOf(intArrayOf(1), intArrayOf())))
        Assert.assertEquals(listOf(listOf(0, 1, 3), listOf(0, 2, 3)), allPathsSourceTarget(arrayOf(intArrayOf(1, 2), intArrayOf(3), intArrayOf(3), intArrayOf())))
    }

    @Test
    fun testFindMin() {
        Assert.assertEquals(1, findMin(intArrayOf(1, 3, 5)))
        Assert.assertEquals(0, findMin(intArrayOf(2, 2, 2, 0, 1)))
        Assert.assertEquals(0, findMin(intArrayOf(1, 1, 1, 1, 0, 1, 1)))
    }

    @Test
    fun testAddDigits() {
        Assert.assertEquals(0, addDigits(0))
        Assert.assertEquals(2, addDigits(38))
        Assert.assertEquals(1, addDigits(2035))
    }
}