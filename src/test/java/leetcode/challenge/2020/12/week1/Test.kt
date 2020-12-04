package leetcode.challenge.`2020`.`12`.week1

import leetcode.BinaryTree
import leetcode.ListNode
import leetcode.joinToString
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

    @Test
    fun increasingBSTTest() {
        Assert.assertEquals(
                listOf(1, null, 5).joinToString(),
                increasingBST(BinaryTree(listOf(5, 1)).head).joinToString()
        )

        Assert.assertEquals(
            listOf(1, null, 5, null, 7).joinToString(),
            increasingBST(BinaryTree(listOf(5, 1, 7)).head).joinToString()
        )
        Assert.assertEquals(
            listOf(1, null, 2, null, 3, null, 4, null, 5, null, 6, null, 7, null, 8, null, 9).joinToString(),
            increasingBST(BinaryTree(listOf(5, 3, 6, 2, 4, null, 8, 1, null, null, null, 7, 9)).head).joinToString()
        )
    }

    @Test
    fun kthFactorTest() {
        Assert.assertEquals(2, kthFactor(2, 2))
        Assert.assertEquals(1, kthFactor(1, 1))
        Assert.assertEquals(-1, kthFactor(4, 4))
        Assert.assertEquals(3, kthFactor(12, 3))
        Assert.assertEquals(7, kthFactor(7, 2))
        Assert.assertEquals(4, kthFactor(1000, 3))
    }
}