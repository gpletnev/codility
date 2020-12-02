package leetcode.challenge.`2020`.`12`.week1

import leetcode.BinaryTree
import leetcode.ListNode
import org.junit.Assert
import org.junit.Test

class Test {
    @Test
    fun maxDepthTest() {
        Assert.assertEquals(3, maxDepth(BinaryTree(listOf(3, 9, 20, null, null, 15, 7)).head))
        Assert.assertEquals(2, maxDepth(BinaryTree(listOf(1, null, 2)).head))
        Assert.assertEquals(0, maxDepth(BinaryTree(listOf()).head))
    }

    @Test
    fun getRandomListNodeTest() {
        val head = ListNode(1)

        Assert.assertEquals(1, Solution(head).getRandom())

        head.next = ListNode(2)
        repeat(100) { Assert.assertTrue(Solution(head).getRandom() in 1..2) }

        head.next!!.next = ListNode(3)
        repeat(100) { Assert.assertTrue(Solution(head).getRandom() in 1..3) }
    }
}