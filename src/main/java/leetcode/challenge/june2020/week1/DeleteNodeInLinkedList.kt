package leetcode.challenge.june2020.week1

// https://leetcode.com/problems/delete-node-in-a-linked-list/
fun deleteNode(node: ListNode?) {
    node!!.`val` = node.next!!.`val`
    node.next = node.next!!.next
}

class ListNode(var `val`: Int) {
    var next: ListNode? = null
}

fun ListNode.toIntArray(): IntArray {
    val intArray = mutableListOf<Int>()
    var node: ListNode? = this
    while (node != null) {
        intArray.add(node.`val`)
        node = node.next
    }

    return intArray.toIntArray()
}
