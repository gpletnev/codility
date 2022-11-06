package leetcode.challenge.`2020`.`12`.week2

import leetcode.BinaryTree
import org.junit.jupiter.api.Test
import kotlin.collections.copyOf
import kotlin.collections.listOf
import kotlin.collections.toTypedArray
import kotlin.test.assertContentEquals
import kotlin.test.assertEquals

class Test {
    @Test
    fun numPairsDivisibleBy60Test() {
        assertEquals(3, numPairsDivisibleBy60(intArrayOf(30, 20, 150, 100, 40)))
        assertEquals(3, numPairsDivisibleBy60(intArrayOf(60, 60, 60)))
    }

    @Test
    fun testBSTIterator() {
        val binaryTree = BinaryTree(listOf(7, 3, 15, null, null, 9, 20))
        val bstIterator = BSTIterator(binaryTree.head)
        assertEquals(3, bstIterator.next())
        assertEquals(7, bstIterator.next())
        assertEquals(true, bstIterator.hasNext())
        assertEquals(9, bstIterator.next())
        assertEquals(true, bstIterator.hasNext())
        assertEquals(15, bstIterator.next())
        assertEquals(true, bstIterator.hasNext())
        assertEquals(20, bstIterator.next())
        assertEquals(false, bstIterator.hasNext())
    }

    @Test
    fun validMountainArrayTest() {
        assertEquals(false, validMountainArray(intArrayOf(9, 8, 7, 6, 5, 4, 3, 2, 1, 0)))
        assertEquals(false, validMountainArray(intArrayOf(2, 1)))
        assertEquals(false, validMountainArray(intArrayOf(3, 5, 5)))
        assertEquals(true, validMountainArray(intArrayOf(0, 3, 2, 1)))
    }

    @Test
    fun removeDuplicatesTest() {
        var array = intArrayOf(1, 1, 1, 2, 2, 3)
        assertEquals(5, removeDuplicates(array))
        assertContentEquals(intArrayOf(1, 1, 2, 2, 3), array.copyOf(5))

        array = intArrayOf(0, 0, 1, 1, 1, 1, 2, 3, 3)
        assertEquals(7, removeDuplicates(array))
        assertContentEquals(intArrayOf(0, 0, 1, 1, 2, 3, 3), array.copyOf(7))
    }

    @Test
    fun subtreeWithAllDeepestTest() {
        var binaryTree = BinaryTree(listOf(1))
        assertEquals(binaryTree.head!!, subtreeWithAllDeepest(binaryTree.head!!))

        binaryTree = BinaryTree(listOf(0, 1, 3, null, 2))
        assertEquals(binaryTree.head!!.left!!.right, subtreeWithAllDeepest(binaryTree.head!!))

        binaryTree = BinaryTree(listOf(3, 5, 1, 6, 2, 0, 8, null, null, 7, 4))
        assertEquals(binaryTree.head!!.left!!.right, subtreeWithAllDeepest(binaryTree.head!!))
    }

    @Test
    fun maxCoinsTest() {
        assertEquals(167, maxCoins(intArrayOf(3, 1, 5, 8)))
    }

    @Test
    fun partitionTest() {
        assertContentEquals(listOf(listOf("a")).toTypedArray(), partition("a").toTypedArray())
        assertContentEquals(
            listOf(listOf("a", "a", "b"), listOf("aa", "b")).toTypedArray(),
            partition("aab").toTypedArray()
        )
    }
}