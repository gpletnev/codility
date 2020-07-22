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