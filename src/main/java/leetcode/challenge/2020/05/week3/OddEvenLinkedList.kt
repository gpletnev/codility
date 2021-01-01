package leetcode.challenge.`2020`.`05`.week3

object OddEvenLinkedList {
    fun oddEvenList(head: ListNode?): ListNode? {

        if (head == null) return null
        var odd: ListNode? = head
        var even: ListNode? = head.next
        val evenHead = even
        // can be done with index % 2
        while (even != null && even.next != null) {
            odd!!.next = even.next
            odd = odd.next
            even.next = odd!!.next
            even = even.next
        }
        odd!!.next = evenHead

        return head
    }
}

class ListNode(var `val`: Int) {
    var next: ListNode? = null

    override fun toString(): String {
        val builder = StringBuilder()
        var node: ListNode? = this
        do {
            if (node != null) {
                builder.append(node.`val`).append(' ')
                node = node.next
            } else {
                builder.append("NULL")
                break
            }
        } while (true)

        return builder.toString()
    }
}