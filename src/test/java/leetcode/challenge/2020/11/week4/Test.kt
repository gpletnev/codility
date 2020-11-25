package leetcode.challenge.`2020`.`11`.week4

import leetcode.BinaryTree
import org.junit.Assert
import org.junit.Test

class Test {
    @Test
    fun robTest() {
        var root = BinaryTree(listOf(3, 2, 3, null, 3, null, 1)).head
        Assert.assertEquals(7, rob(root))

        root = BinaryTree(listOf(3, 4, 5, 1, 3, null, 1)).head
        Assert.assertEquals(9, rob(root))
    }

    @Test
    fun calculateTest() {
        Assert.assertEquals(7, calculate("3+2*2"))
        Assert.assertEquals(1, calculate(" 3/2"))
        Assert.assertEquals(5, calculate("3+5 / 2"))
    }

    @Test
    fun smallestRepunitDivByKTest() {
        Assert.assertEquals(22, smallestRepunitDivByK(23))
        Assert.assertEquals(1, smallestRepunitDivByK(1))
        Assert.assertEquals(-1, smallestRepunitDivByK(2))
        Assert.assertEquals(3, smallestRepunitDivByK(3))
        Assert.assertEquals(16, smallestRepunitDivByK(17))
        Assert.assertEquals(-1, smallestRepunitDivByK(5))
    }
}