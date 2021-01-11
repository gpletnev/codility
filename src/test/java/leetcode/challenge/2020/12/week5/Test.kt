package leetcode.challenge.`2020`.`12`.week5

import leetcode.BinaryTree
import org.junit.Assert
import org.junit.Test

class Test {
    @Test
    fun pseudoPalindromicPathsTest() {
        Assert.assertEquals(1, pseudoPalindromicPaths(BinaryTree(listOf(9)).head))
        Assert.assertEquals(
            1,
            pseudoPalindromicPaths(BinaryTree(listOf(2, 1, 1, 1, 3, null, null, null, null, null, 1)).head)
        )
        Assert.assertEquals(2, pseudoPalindromicPaths(BinaryTree(listOf(2, 3, 1, 3, 1, null, 1)).head))
    }
}