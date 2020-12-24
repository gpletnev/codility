package leetcode

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

fun IntArray.toList(): ListNode? {
    return if (this.isNotEmpty()) {
        val head = ListNode(this[0])
        var next = head
        for (i in 1..this.lastIndex) {
            val node = ListNode(this[i])
            next.next = node
            next = next.next!!
        }
        head
    } else {
        null
    }
}