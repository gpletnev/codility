package leetcode.challenge.`2021`.`02`.week1

import leetcode.BinaryTree
import leetcode.joinToString
import org.junit.jupiter.api.Test
import kotlin.test.assertContentEquals
import kotlin.test.assertEquals

class Test {
    @Test
    fun hammingWeightTest() {
        assertEquals(3, hammingWeight(0b00000000000000000000000000001011))
        assertEquals(1, hammingWeight(0b00000000000000000000000010000000))
        assertEquals(31, hammingWeight(-3/*0b11111111_11111111_11111111_11111101*/))
    }

    @Test
    fun trimBSTTest() {
        assertEquals(
            listOf(1, null, 2).joinToString(),
            trimBST(BinaryTree(listOf(1, 0, 2)).head, 1, 2).joinToString()
        )
        assertEquals(
            listOf(3, 2, null, 1).joinToString(),
            trimBST(BinaryTree(listOf(3, 0, 4, null, 2, null, null, 1)).head, 1, 3).joinToString()
        )
        assertEquals(
            listOf(1, null, 2).joinToString(),
            trimBST(BinaryTree(listOf(1, null, 2)).head, 1, 3).joinToString()
        )
        assertEquals(
            listOf(2).joinToString(),
            trimBST(BinaryTree(listOf(1, null, 2)).head, 2, 4).joinToString()
        )
    }

    @Test
    fun findLHSTest() {
        assertEquals(5, findLHS(intArrayOf(1, 3, 2, 2, 5, 2, 3, 7)))
        assertEquals(2, findLHS(intArrayOf(1, 2, 3, 4)))
        assertEquals(0, findLHS(intArrayOf(1, 1, 1, 1)))
    }

    @Test
    fun simplifyPathTest() {
        assertEquals("/home", simplifyPath("/home/"))
        assertEquals("/", simplifyPath("/../"))
        assertEquals("/home/foo", simplifyPath("/home//foo/"))
        assertEquals("/c", simplifyPath("/a/./b/../../c/"))
    }

    @Test
    fun rightSideViewTest() {
        assertContentEquals(
            intArrayOf(1, 3, 4),
            rightSideView(BinaryTree(listOf(1, 2, 3, null, 5, null, 4)).head).toIntArray()
        )
    }

    @Test
    fun shortestToCharTest() {
        assertContentEquals(
            intArrayOf(3, 2, 1, 0, 1, 0, 0, 1, 2, 2, 1, 0),
            shortestToChar(s = "loveleetcode", c = 'e')
        )
        assertContentEquals(
            intArrayOf(3, 2, 1, 0),
            shortestToChar(s = "aaab", c = 'b')
        )
    }
}