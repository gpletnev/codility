package leetcode.challenge.july2020.week4

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
}