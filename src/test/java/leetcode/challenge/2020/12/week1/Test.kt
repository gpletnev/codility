package leetcode.challenge.`2020`.`12`.week1

import leetcode.BinaryTree
import org.junit.Assert
import org.junit.Test

class Test {
    @Test
    fun maxDepthTest() {
        Assert.assertEquals(3, maxDepth(BinaryTree(listOf(3, 9, 20, null, null, 15, 7)).head))
        Assert.assertEquals(2, maxDepth(BinaryTree(listOf(1, null, 2)).head))
        Assert.assertEquals(0, maxDepth(BinaryTree(listOf()).head))
    }
}