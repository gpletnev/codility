package leetcode

import java.util.*

class Node(var `val`: Int) {
    var neighbors: ArrayList<Node?> = ArrayList<Node?>()

    override fun toString(): String {
        val arrayList = arrayListOf<IntArray>()

        val map: MutableMap<Int, IntArray> = HashMap()
        val queue: Deque<Node?> = LinkedList<Node?>()

        map[this.`val`] = neighborsToIntArray(neighbors)
        queue.add(this)
        while (queue.isNotEmpty()) {
            val currNode = queue.poll()
            for (currNeighbor in currNode!!.neighbors) {
                if (!map.containsKey(currNeighbor?.`val`)) {
                    map[currNeighbor!!.`val`] = neighborsToIntArray(currNeighbor.neighbors)
                    queue.add(currNeighbor)
                }
            }
        }

        for (i in 1..map.size) {
            arrayList.add(map[i]!!)
        }
        return arrayList.toString()
    }

    private fun neighborsToIntArray(neighbors: ArrayList<Node?>): IntArray {
        return neighbors.map { `val` }.toIntArray()
    }
}
