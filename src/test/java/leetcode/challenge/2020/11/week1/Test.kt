package leetcode.challenge.`2020`.`11`.week1

import leetcode.ListNode
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
}