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
}