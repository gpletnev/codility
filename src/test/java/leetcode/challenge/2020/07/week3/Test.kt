package leetcode.challenge.`2020`.`07`.week3

import leetcode.ListNode
import leetcode.toIntArray
import org.junit.Assert
import org.junit.Test

class Test {
    @Test
    fun testReverseWords() {
        Assert.assertEquals("world! hello", reverseWords("  hello   world!  "))
        Assert.assertEquals("blue is sky the", reverseWords("the sky is blue"))
        Assert.assertEquals("example good a", reverseWords("a good   example"))
    }

    @Test
    fun testMyPow() {
        Assert.assertEquals(1024.0, myPow(2.0, 10), 0.00001)
        Assert.assertEquals(9.261, myPow(2.1, 3), 0.00001)
        Assert.assertEquals(0.25, myPow(2.0, -2), 0.00001)
    }

    @Test
    fun testTopKFrequent() {
        Assert.assertArrayEquals(intArrayOf(1, 2), topKFrequent(intArrayOf(1, 1, 1, 2, 2, 3), 2))
        Assert.assertArrayEquals(intArrayOf(1), topKFrequent(intArrayOf(1), 1))
    }

    @Test
    fun testRemoveElements() {
        var head: ListNode? = null
        Assert.assertEquals(null, removeElements(head, 6))
        head = ListNode(6)
        Assert.assertEquals(null, removeElements(head, 6))
        head.next = ListNode(6)
        Assert.assertEquals(null, removeElements(head, 6))
        head = ListNode(1)
        head.next = ListNode(2)
        head.next!!.next = ListNode(3)
        head.next!!.next!!.next = ListNode(6)
        Assert.assertArrayEquals(intArrayOf(1, 2, 3), removeElements(head, 6)?.toIntArray())
    }

    @Test
    fun testWordSearch() {
        var board = arrayOf(
                charArrayOf('A', 'B', 'C', 'E'),
                charArrayOf('S', 'F', 'C', 'S'),
                charArrayOf('A', 'D', 'E', 'E')
        )
        Assert.assertEquals(true, exist(arrayOf(charArrayOf('A', 'B'), charArrayOf('S', 'F')), "F"))
        Assert.assertEquals(true, exist(board, "F"))
        Assert.assertEquals(true, exist(board, "ABCCED"))
        Assert.assertEquals(true, exist(board, "SEE"))
        Assert.assertEquals(false, exist(board, "ABCB"))

        board = arrayOf(
                charArrayOf('A', 'B', 'C', 'E'),
                charArrayOf('S', 'F', 'E', 'S'),
                charArrayOf('A', 'D', 'E', 'E')
        )
        Assert.assertEquals(true, exist(board.clone(), "ABCESEEEFS"))
        Assert.assertEquals(true, exist(arrayOf(charArrayOf('C', 'A', 'A'), charArrayOf('A', 'A', 'C'), charArrayOf('B', 'C', 'D')), "AAB"))
    }
}