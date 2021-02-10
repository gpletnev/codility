package leetcode.challenge.`2021`.`02`.week2

// https://leetcode.com/problems/copy-list-with-random-pointer/
class Node(var `val`: Int) {
    var next: Node? = null
    var random: Node? = null
}

fun copyRandomList(head: Node?): Node? {
    if (head == null) return null
    val map = mutableMapOf<Node, Node?>()

    // loop 1. copy all the nodes
    var node = head
    while (node != null) {
        map[node] = Node(node.`val`)
        node = node.next
    }

    // loop 2. assign next and random pointers
    node = head
    while (node != null) {
        map[node]!!.next = map[node.next]
        map[node]!!.random = map[node.random]
        node = node.next
    }

    return map[head]
}