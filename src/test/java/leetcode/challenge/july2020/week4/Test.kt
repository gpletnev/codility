package leetcode.challenge.july2020.week4

import leetcode.BinaryTree
import org.junit.Assert
import org.junit.Test
import java.util.*

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
    fun testFindMin() {
        Assert.assertEquals(1, findMin(intArrayOf(1, 3, 5)))
        Assert.assertEquals(0, findMin(intArrayOf(2, 2, 2, 0, 1)))
        Assert.assertEquals(0, findMin(intArrayOf(1, 1, 1, 1, 0, 1, 1)))
    }
}