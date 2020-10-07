package leetcode.challenge.`2020`.`10`.week1

import leetcode.ListNode
import leetcode.toIntArray
import org.junit.Assert
import org.junit.Test

class Test {
    @Test
    fun testRecentCounter() {
        val recentCounter = RecentCounter()
        Assert.assertEquals(1, recentCounter.ping(1))
        Assert.assertEquals(2, recentCounter.ping(100))
        Assert.assertEquals(3, recentCounter.ping(3001))
        Assert.assertEquals(3, recentCounter.ping(3002))
    }

    @Test
    fun testCombinationSum() {
        Assert.assertEquals("[]", combinationSum(intArrayOf(2), 1).toString())
        Assert.assertEquals("[[1]]", combinationSum(intArrayOf(1), 1).toString())
        Assert.assertEquals("[[1, 1]]", combinationSum(intArrayOf(1), 2).toString())
        Assert.assertEquals("[[2, 2, 2, 2], [2, 3, 3], [3, 5]]", combinationSum(intArrayOf(2, 3, 5), 8).toString())
        Assert.assertEquals("[[2, 2, 3], [7]]", combinationSum(intArrayOf(2, 3, 6, 7), 7).toString())
    }

    @Test
    fun testFindPairs() {
        Assert.assertEquals(2, findPairs(intArrayOf(-1, -1, -3), 1))
        Assert.assertEquals(2, findPairs(intArrayOf(1, 2, 4, 4, 3, 3, 0, 9, 2, 3), 3))
        Assert.assertEquals(1, findPairs(intArrayOf(1, 3, 1, 5, 4), 0))
        Assert.assertEquals(4, findPairs(intArrayOf(1, 2, 3, 4, 5), 1))
        Assert.assertEquals(2, findPairs(intArrayOf(3, 1, 4, 1, 5), 2))
    }

    @Test
    fun testRemoveCoveredIntervals() {
        Assert.assertEquals(2, removeCoveredIntervals(arrayOf(intArrayOf(1, 4), intArrayOf(3, 6), intArrayOf(2, 8))))
        Assert.assertEquals(1, removeCoveredIntervals(arrayOf(intArrayOf(1, 4), intArrayOf(2, 3))))
        Assert.assertEquals(2, removeCoveredIntervals(arrayOf(intArrayOf(0, 10), intArrayOf(5, 12))))
        Assert.assertEquals(2, removeCoveredIntervals(arrayOf(intArrayOf(1, 4), intArrayOf(3, 6), intArrayOf(2, 8))))
        Assert.assertEquals(1, removeCoveredIntervals(arrayOf(intArrayOf(1, 2), intArrayOf(1, 4), intArrayOf(3, 4))))
    }

    @Test
    fun testBitwiseComplement() {
        Assert.assertEquals(2, bitwiseComplement(5))
        Assert.assertEquals(0, bitwiseComplement(7))
        Assert.assertEquals(5, bitwiseComplement(10))
        Assert.assertEquals(1, bitwiseComplement(0))
    }

    @Test
    fun testRotateRight() {
        var head = ListNode(1)
        head.next = ListNode(2)
        Assert.assertArrayEquals(intArrayOf(2, 1), rotateRight(head, 1)?.toIntArray())

        head = ListNode(1)
        head.next = ListNode(2)
        head.next!!.next = ListNode(3)
        Assert.assertArrayEquals(intArrayOf(3, 1, 2), rotateRight(head, 1)?.toIntArray())

        head = ListNode(1)
        head.next = ListNode(2)
        head.next!!.next = ListNode(3)
        Assert.assertArrayEquals(intArrayOf(3, 1, 2), rotateRight(head, 4)?.toIntArray())

        head = ListNode(1)
        head.next = ListNode(2)
        head.next!!.next = ListNode(3)
        head.next!!.next!!.next = ListNode(4)
        head.next!!.next!!.next!!.next = ListNode(5)
        Assert.assertArrayEquals(intArrayOf(4, 5, 1, 2, 3), rotateRight(head, 2)?.toIntArray())
    }
}