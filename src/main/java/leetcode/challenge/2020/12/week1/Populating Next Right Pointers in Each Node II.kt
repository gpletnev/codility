package leetcode.challenge.`2020`.`12`.week1

// https://leetcode.com/problems/populating-next-right-pointers-in-each-node-ii/
data class Node(
    val `val`: Int,
    var left: Node?,
    var right: Node?,
    var next: Node?
)

fun connect(root: Node?): Node? {

    var head: Node? = root

    var prev: Node?

    var curr: Node?

    while (head != null) {
        curr = head
        prev = null
        head = null
        while (curr != null) {
            if (curr.left != null) {
                if (prev != null) prev.next = curr.left else head = curr.left
                prev = curr.left
            }
            if (curr.right != null) {
                if (prev != null) prev.next = curr.right else head = curr.right
                prev = curr.right
            }
            curr = curr.next
        }
    }
    return root
}