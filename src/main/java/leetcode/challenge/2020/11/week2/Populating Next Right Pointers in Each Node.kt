package leetcode.challenge.`2020`.`11`.week2

class Node(var `val`: Int) {
    var left: Node? = null
    var right: Node? = null
    var next: Node? = null
}

// https://leetcode.com/problems/populating-next-right-pointers-in-each-node/
fun connect(root: Node?): Node? {
    if (root == null) return root

    var leftMost = root

    while (leftMost != null) {
        var head = leftMost

        while (head != null) {
            head.left?.next = head.right
            if (head.next != null) {
                head.right?.next = head.next?.left
            }

            head = head.next
        }

        leftMost = leftMost.left
    }

    return root
}