package leetcode.challenge.`2021`.`04`.week1

import leetcode.ListNode

// https://leetcode.com/problems/palindrome-linked-list/

var isPalindrome = true

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
}