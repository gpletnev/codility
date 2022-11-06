package leetcode.challenge.`2020`.`12`.week1

import leetcode.BinaryTree
import leetcode.ListNode
import leetcode.joinToString
import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Test
import kotlin.test.assertEquals
import kotlin.test.assertTrue

class Test {
    @Test
    fun maxDepthTest() {
        assertEquals(3, maxDepth(BinaryTree(listOf(3, 9, 20, null, null, 15, 7)).head))
        assertEquals(2, maxDepth(BinaryTree(listOf(1, null, 2)).head))
        assertEquals(0, maxDepth(BinaryTree(listOf()).head))
    }

    @Test
    fun getRandomListNodeTest() {
        val head = ListNode(1)

        assertEquals(1, Solution(head).getRandom())

        head.next = ListNode(2)
        repeat(100) { assertTrue(Solution(head).getRandom() in 1..2) }

        head.next!!.next = ListNode(3)
        repeat(100) { assertTrue(Solution(head).getRandom() in 1..3) }
    }

    @Test
    fun increasingBSTTest() {
        assertEquals(
            listOf(1, null, 5).joinToString(),
            increasingBST(BinaryTree(listOf(5, 1)).head).joinToString()
        )

        assertEquals(
            listOf(1, null, 5, null, 7).joinToString(),
            increasingBST(BinaryTree(listOf(5, 1, 7)).head).joinToString()
        )
        assertEquals(
            listOf(1, null, 2, null, 3, null, 4, null, 5, null, 6, null, 7, null, 8, null, 9).joinToString(),
            increasingBST(BinaryTree(listOf(5, 3, 6, 2, 4, null, 8, 1, null, null, null, 7, 9)).head).joinToString()
        )
    }

    @Test
    fun kthFactorTest() {
        assertEquals(2, kthFactor(2, 2))
        assertEquals(1, kthFactor(1, 1))
        assertEquals(-1, kthFactor(4, 4))
        assertEquals(3, kthFactor(12, 3))
        assertEquals(7, kthFactor(7, 2))
        assertEquals(4, kthFactor(1000, 3))
    }

    @Test
    fun canPlaceFlowersTest() {
        assertEquals(true, canPlaceFlowers(intArrayOf(1, 0, 0, 0, 1), 1))
        assertEquals(false, canPlaceFlowers(intArrayOf(1, 0, 0, 0, 1), 2))
    }

    @Test
    fun generateMatrixTest() {
        Assertions.assertArrayEquals(arrayOf(intArrayOf(1)), generateMatrix(1))
        Assertions.assertArrayEquals(arrayOf(intArrayOf(1, 2), intArrayOf(4, 3)), generateMatrix(2))
        Assertions.assertArrayEquals(
            arrayOf(intArrayOf(1, 2, 3), intArrayOf(8, 9, 4), intArrayOf(7, 6, 5)),
            generateMatrix(3)
        )
    }
}