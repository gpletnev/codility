package leetcode.challenge.`2021`.`04`.week1

import leetcode.ListNode

// https://leetcode.com/problems/palindrome-linked-list/

/*var isPalindrome = true

fun isPalindrome(head: ListNode?): Boolean {
    isPalindrome = true
    if (head != null) {
        isPalindrome(head, head)
    }
    return isPalindrome
}

fun isPalindrome(slow: ListNode, fast: ListNode): ListNode? {
    val mySlow = if (fast.next == null) slow else isPalindrome(slow, fast.next!!)!!
    if (fast.`val` != mySlow.`val`) {
        isPalindrome = false
    }
    return mySlow.next
}*/

fun isPalindrome(head: ListNode?): Boolean {
    if (head == null) return true

    // Find the end of first half and reverse second half.
    val firstHalfEnd = endOfFirstHalf(head)
    val secondHalfStart = reverseList(firstHalfEnd!!.next)

    // Check whether or not there is a palindrome.
    var p1 = head
    var p2 = secondHalfStart
    var result = true
    while (result && p2 != null) {
        if (p1!!.`val` != p2.`val`) result = false
        p1 = p1.next
        p2 = p2.next
    }

    // Restore the list and return the result.
    firstHalfEnd.next = reverseList(secondHalfStart)
    return result
}

// Taken from https://leetcode.com/problems/reverse-linked-list/solution/
private fun reverseList(head: ListNode?): ListNode? {
    var prev: ListNode? = null
    var curr = head
    while (curr != null) {
        val nextTemp = curr.next
        curr.next = prev
        prev = curr
        curr = nextTemp
    }
    return prev
}

private fun endOfFirstHalf(head: ListNode): ListNode? {
    var fast: ListNode? = head
    var slow: ListNode? = head
    while (fast!!.next != null && fast.next!!.next != null) {
        fast = fast.next!!.next
        slow = slow!!.next
    }
    return slow
}