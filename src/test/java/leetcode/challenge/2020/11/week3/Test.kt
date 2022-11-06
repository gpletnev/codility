package leetcode.challenge.`2020`.`11`.week3

import leetcode.BinaryTree
import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Test
import kotlin.test.assertEquals

class Test {
    @Test
    fun rangeSumBSTTest() {
        var tree = BinaryTree(listOf(10, 5, 15, 3, 7, null, 18))
        assertEquals(32, rangeSumBST(tree.head, 7, 15))

        tree = BinaryTree(listOf(10, 5, 15, 3, 7, 13, 18, 1, null, 6))
        assertEquals(23, rangeSumBST(tree.head, 6, 10))
    }

    @Test
    fun longestMountainTest() {
        assertEquals(0, longestMountain(intArrayOf(2, 2, 3)))
        assertEquals(5, longestMountain(intArrayOf(2, 1, 4, 7, 3, 2, 5)))
        assertEquals(0, longestMountain(intArrayOf(2, 2, 2)))
    }

    @Test
    fun mirrorReflectionTest() {
        assertEquals(2, mirrorReflection(2, 1))
    }

    @Test
    fun mergeTest() {
        Assertions.assertArrayEquals(
            arrayOf(intArrayOf(1, 6), intArrayOf(8, 10), intArrayOf(15, 18)),
            merge(arrayOf(intArrayOf(1, 3), intArrayOf(2, 6), intArrayOf(8, 10), intArrayOf(15, 18)))
        )
        Assertions.assertArrayEquals(arrayOf(intArrayOf(1, 5)), merge(arrayOf(intArrayOf(1, 4), intArrayOf(4, 5))))
    }

    @Test
    fun decodeStringTest() {
        assertEquals("a", decodeString("a"))
        assertEquals("aaabcbc", decodeString("3[a]2[bc]"))
        assertEquals("accaccacc", decodeString("3[a2[c]]"))
        assertEquals("abcabccdcdcdef", decodeString("2[abc]3[cd]ef"))
        assertEquals("abccdcdcdxyz", decodeString("abc3[cd]xyz"))
    }

    @Test
    fun atMostNGivenDigitSetTest() {
        assertEquals(1, atMostNGivenDigitSet(arrayOf("7"), 8))
        assertEquals(20, atMostNGivenDigitSet(arrayOf("1", "3", "5", "7"), 100))
        assertEquals(29523, atMostNGivenDigitSet(arrayOf("1", "4", "9"), 1000000000))
    }
}