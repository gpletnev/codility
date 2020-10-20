package leetcode.challenge.`2020`.`10`.week3

import leetcode.Node
import java.util.*
import kotlin.collections.set

// https://leetcode.com/problems/clone-graph/
fun cloneGraph(node: Node?): Node? {
    if (node == null) return null

    val map: MutableMap<Node?, Node> = HashMap()
    val queue: Deque<Node?> = LinkedList<Node?>()

    map[node] = Node(node.`val`)
    queue.add(node)
    while (queue.isNotEmpty()) {
        val currNode = queue.poll()
        for (currNeighbor in currNode!!.neighbors) {
            if (!map.containsKey(currNeighbor)) {
                map[currNeighbor] = Node(currNeighbor!!.`val`)
                queue.add(currNeighbor)
            }
            map[currNode]!!.neighbors.add(map[currNeighbor])
        }
    }
    return map[node]
}