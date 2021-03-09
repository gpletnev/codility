package leetcode.challenge.`2021`.`03`.week2

import leetcode.BinaryTree
import leetcode.joinToString
import org.junit.Assert
import org.junit.Test

class Test {
    @Test
    fun addOneRowTest() {
        Assert.assertEquals(
            BinaryTree(listOf(4, 1, 1, 2, null, null, 6, 2, 1, 5)).head.joinToString(),
            addOneRow(BinaryTree(listOf(4, 2, 6, 2, 1, 5)).head!!, 1, 2).joinToString()
        )
        Assert.assertEquals(
            BinaryTree(listOf(4, 2, null, 1, 1, 3, null, null, 1)).head.joinToString(),
            addOneRow(BinaryTree(listOf(4, 2, null, 3, 1)).head!!, 1, 3).joinToString()
        )
    }
}