package leetcode.challenge.`2020`.`07`.week4

import leetcode.BinaryTree
import org.junit.jupiter.api.Test
import java.util.*
import kotlin.test.assertContentEquals
import kotlin.test.assertEquals

class Test {
    @Test
    fun testZigzagLevelOrder() {
        assertEquals(LinkedList<List<Int>>(), zigzagLevelOrder(null))
        val head = BinaryTree(listOf(3, 9, 20, null, null, 15, 7)).head
        assertEquals(listOf(listOf(3), listOf(20, 9), listOf(15, 7)), zigzagLevelOrder(head))
    }

    @Test
    fun testSingleNumberIII() {
        assertContentEquals(intArrayOf(3, 5), singleNumber(intArrayOf(1, 2, 1, 3, 2, 5)))
    }

    @Test
    fun testAllPathsSourceTarget() {
        assertEquals(ArrayList<ArrayList<Int>>(), allPathsSourceTarget(arrayOf(intArrayOf(), intArrayOf())))
        assertEquals(listOf(listOf(0, 1)), allPathsSourceTarget(arrayOf(intArrayOf(1), intArrayOf())))
        assertEquals(listOf(listOf(0, 1, 3), listOf(0, 2, 3)), allPathsSourceTarget(arrayOf(intArrayOf(1, 2), intArrayOf(3), intArrayOf(3), intArrayOf())))
    }

    @Test
    fun testFindMin() {
        assertEquals(1, findMin(intArrayOf(1, 3, 5)))
        assertEquals(0, findMin(intArrayOf(2, 2, 2, 0, 1)))
        assertEquals(0, findMin(intArrayOf(1, 1, 1, 1, 0, 1, 1)))
    }

    @Test
    fun testAddDigits() {
        assertEquals(0, addDigits(0))
        assertEquals(2, addDigits(38))
        assertEquals(1, addDigits(2035))
    }
}