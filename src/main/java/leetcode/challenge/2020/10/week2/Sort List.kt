package leetcode.challenge.`2020`.`10`.week2

import leetcode.ListNode

// https://leetcode.com/problems/sort-list/
object SortList {
/*    var tail: ListNode? = null
    var nextSubList: ListNode? = null

    fun sortList(head: ListNode?): ListNode? {
        if (head?.next == null) return head

        val n = getCount(head)
        var start = head
        val dummyHead = ListNode(0)
        var size = 1
        while (size < n) {
            tail = dummyHead
            while (start != null) {
                if (start.next == null) {
                    tail!!.next = start
                    break
                }
                val mid = split(start, size)
                merge(start, mid)
                start = nextSubList
            }
            start = dummyHead.next
            size *= 2
        }
        return dummyHead.next
    }

    fun split(start: ListNode, size: Int): ListNode? {
        var midPrev: ListNode? = start
        var end = start.next
        //use fast and slow approach to find middle and end of second linked list
        var index = 1
        while (index < size && (midPrev!!.next != null || end!!.next != null)) {
            if (end!!.next != null) {
                end = if (end.next!!.next != null) end.next!!.next else end.next
            }
            if (midPrev.next != null) {
                midPrev = midPrev.next
            }
            index++
        }
        val mid = midPrev!!.next
        midPrev.next = null
        nextSubList = end!!.next
        end.next = null
        // return the start of second linked list
        return mid
    }

    private fun merge(_list1: ListNode?, _list2: ListNode?) {
        var list1 = _list1
        var list2 = _list2
        val dummyHead = ListNode(0)
        var newTail: ListNode? = dummyHead
        while (list1 != null && list2 != null) {
            if (list1.`val` < list2.`val`) {
                newTail!!.next = list1
                list1 = list1.next
                newTail = newTail.next
            } else {
                newTail!!.next = list2
                list2 = list2.next
                newTail = newTail.next
            }
        }
        newTail!!.next = list1 ?: list2
        // traverse till the end of merged list to get the newTail
        while (newTail!!.next != null) {
            newTail = newTail.next
        }
        // link the old tail with the head of merged list
        tail!!.next = dummyHead.next
        // update the old tail to the new tail of merged list
        tail = newTail
    }

    private fun getCount(head: ListNode?): Int {
        var count = 0
        var node = head
        while (node != null) {
            node = node.next
            count++
        }
        return count
    }
*/

    fun sortList(head: ListNode?): ListNode? {
        if (head?.next == null) return head
        val mid = getMid(head)
        val left = sortList(head)
        val right = sortList(mid)
        return merge(left, right)
    }

    @Suppress("NAME_SHADOWING")
    private fun merge(list1: ListNode?, list2: ListNode?): ListNode? {
        var list1 = list1
        var list2 = list2
        val dummyHead = ListNode(0)
        var tail: ListNode? = dummyHead
        while (list1 != null && list2 != null) {
            if (list1.`val` < list2.`val`) {
                tail!!.next = list1
                list1 = list1.next
                tail = tail.next
            } else {
                tail!!.next = list2
                list2 = list2.next
                tail = tail.next
            }
        }
        tail!!.next = list1 ?: list2
        return dummyHead.next
    }

    @Suppress("NAME_SHADOWING")
    private fun getMid(head: ListNode?): ListNode? {
        var head = head
        var midPrev: ListNode? = null
        while (head?.next != null) {
            midPrev = if (midPrev == null) head else midPrev.next
            head = head.next!!.next
        }
        val mid = midPrev!!.next
        midPrev.next = null
        return mid
    }
}
