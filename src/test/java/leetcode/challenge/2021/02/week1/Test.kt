package leetcode.challenge.`2021`.`02`.week1

import leetcode.BinaryTree
import leetcode.joinToString
import org.junit.Assert
import org.junit.Test

class Test {
    @Test
    fun hammingWeightTest() {
        Assert.assertEquals(3, hammingWeight(0b00000000000000000000000000001011))
        Assert.assertEquals(1, hammingWeight(0b00000000000000000000000010000000))
        Assert.assertEquals(31, hammingWeight(-3/*0b11111111_11111111_11111111_11111101*/))
    }

    @Test
    fun trimBSTTest() {
        Assert.assertEquals(
            listOf(1, null, 2).joinToString(),
            trimBST(BinaryTree(listOf(1, 0, 2)).head, 1, 2).joinToString()
        )
        Assert.assertEquals(
            listOf(3, 2, null, 1).joinToString(),
            trimBST(BinaryTree(listOf(3, 0, 4, null, 2, null, null, 1)).head, 1, 3).joinToString()
        )
        Assert.assertEquals(
            listOf(1, null, 2).joinToString(),
            trimBST(BinaryTree(listOf(1, null, 2)).head, 1, 3).joinToString()
        )
        Assert.assertEquals(
            listOf(2).joinToString(),
            trimBST(BinaryTree(listOf(1, null, 2)).head, 2, 4).joinToString()
        )
    }

    @Test
    fun findLHSTest() {
        Assert.assertEquals(5, findLHS(intArrayOf(1, 3, 2, 2, 5, 2, 3, 7)))
        Assert.assertEquals(2, findLHS(intArrayOf(1, 2, 3, 4)))
        Assert.assertEquals(0, findLHS(intArrayOf(1, 1, 1, 1)))
    }

    @Test
    fun simplifyPathTest() {
        Assert.assertEquals("/home", simplifyPath("/home/"))
        Assert.assertEquals("/", simplifyPath("/../"))
        Assert.assertEquals("/home/foo", simplifyPath("/home//foo/"))
        Assert.assertEquals("/c", simplifyPath("/a/./b/../../c/"))
    }

    @Test
    fun rightSideViewTest() {
        Assert.assertArrayEquals(
            intArrayOf(1, 3, 4),
            rightSideView(BinaryTree(listOf(1, 2, 3, null, 5, null, 4)).head).toIntArray()
        )
    }

    @Test
    fun shortestToCharTest() {
        Assert.assertArrayEquals(
            intArrayOf(3, 2, 1, 0, 1, 0, 0, 1, 2, 2, 1, 0),
            shortestToChar(s = "loveleetcode", c = 'e')
        )
        Assert.assertArrayEquals(
            intArrayOf(3, 2, 1, 0),
            shortestToChar(s = "aaab", c = 'b')
        )
    }
}