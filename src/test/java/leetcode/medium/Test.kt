package leetcode.medium

import org.junit.Assert
import org.junit.Test

class Test {

    @Test
    fun testSearchInRotatedSortedArrayII() {
        Assert.assertEquals(true, SearchInRotatedSortedArrayII.search(intArrayOf(2, 5, 6, 0, 0, 1, 2), 0))
        Assert.assertEquals(false, SearchInRotatedSortedArrayII.search(intArrayOf(2, 5, 6, 0, 0, 1, 2), 3))
    }

    @Test
    fun testWordLadder() {
        Assert.assertEquals(5, WordLadder.ladderLength("hit", "cog", listOf("hot", "dot", "dog", "lot", "log", "cog")))
        Assert.assertEquals(0, WordLadder.ladderLength("hit", "cog", listOf("hot", "dot", "dog", "lot", "log")))
    }

    @Test
    fun testLinkedListCycleII() {
        var head = ListNode(3)
        head.next = ListNode(2)
        var next = head.next
        next!!.next = ListNode(0)
        next = head.next
        next!!.next = ListNode(-4)
        next = head.next
        next!!.next = head.next
        Assert.assertEquals(head.next, LinkedListCycleII.detectCycle(head))

        head = ListNode(1)
        head.next = ListNode(2)
        head.next!!.next = head
        Assert.assertEquals(head, LinkedListCycleII.detectCycle(head))

        head.next = null
        Assert.assertEquals(null, LinkedListCycleII.detectCycle(head))
    }
}