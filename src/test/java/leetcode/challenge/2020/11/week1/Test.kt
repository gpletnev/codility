package leetcode.challenge.`2020`.`11`.week1

import leetcode.ListNode
import leetcode.toIntArray
import leetcode.toList
import org.junit.Assert
import org.junit.Test

class Test {
    @Test
    fun getDecimalValueTest() {
        var node = ListNode(0)
        Assert.assertEquals(0, getDecimalValue(node))

        node = ListNode(1)
        Assert.assertEquals(1, getDecimalValue(node))

        node = ListNode(0)
        node.next = ListNode(0)
        Assert.assertEquals(0, getDecimalValue(node))

        node = ListNode(1)
        node.next = ListNode(0)
        node.next!!.next = ListNode(1)
        Assert.assertEquals(5, getDecimalValue(node))

        node = intArrayOf(1, 0, 0, 1, 0, 0, 1, 1, 1, 0, 0, 0, 0, 0, 0).toList()!!
        Assert.assertEquals(18880, getDecimalValue(node))
    }

    @Test
    fun insertionSortListTest() {
        var node = intArrayOf(4, 2, 1, 3).toList()
        Assert.assertArrayEquals(intArrayOf(1, 2, 3, 4), insertionSortList(node)?.toIntArray())

        node = intArrayOf(-1, 5, 3, 4, 0).toList()
        Assert.assertArrayEquals(intArrayOf(-1, 0, 3, 4, 5), insertionSortList(node)?.toIntArray())
    }

    @Test
    fun maxPowerTest() {
        Assert.assertEquals(2, maxPower("cc"))
        Assert.assertEquals(2, maxPower("leetcode"))
        Assert.assertEquals(5, maxPower("abbcccddddeeeeedcba"))
        Assert.assertEquals(5, maxPower("triplepillooooow"))
        Assert.assertEquals(11, maxPower("hooraaaaaaaaaaay"))
        Assert.assertEquals(1, maxPower("tourist"))
    }
}