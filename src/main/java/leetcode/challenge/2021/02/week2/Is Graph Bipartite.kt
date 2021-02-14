package leetcode.challenge.`2021`.`02`.week2

import java.util.*

// https://leetcode.com/problems/is-graph-bipartite/
fun isBipartite(graph: Array<IntArray>): Boolean {
    val map = mutableMapOf<Int, Int>()
    for (i in graph.indices) {
        if (graph[i].isNotEmpty() && !map.containsKey(i)) {
            val queue: Queue<Int> = LinkedList()
            map[i] = 1
            queue.offer(i)
            while (queue.isNotEmpty()) {
                val curr = queue.poll()
                val currColor = map[curr]!!
                for (g in graph[curr]) {
                    if (!map.containsKey(g)) {
                        val newColor = if (currColor == 1) 2 else 1
                        map[g] = newColor
                        queue.offer(g)
                    } else if (map[g] == currColor) {
                        return false
                    }
                }
            }
        }
    }
    return true
}