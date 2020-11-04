package leetcode.challenge.`2020`.`11`.week1

import java.util.*

// https://leetcode.com/problems/minimum-height-trees/
fun findMinHeightTrees(n: Int, edges: Array<IntArray>): List<Int> {
    // base cases
    if (n < 2) {
        return List(n) { i -> i }
    }

    // Build the graph with the adjacency list
    val neighbors = List(n) { HashSet<Int>() }

    for ((a, b) in edges) {
        neighbors[a].add(b)
        neighbors[b].add(a)
    }

    // Initialize the first layer of leaves
    var leaves = mutableListOf<Int>()
    for (i in neighbors.indices)
        if (neighbors[i].size == 1) leaves.add(i)

    // Trim the leaves until reaching the centroids
    var remainingNodes = n
    while (remainingNodes > 2) {
        remainingNodes -= leaves.size
        val newLeaves = mutableListOf<Int>()

        // remove the current leaves along with the edges
        for (leaf in leaves) {
            for (neighbor in neighbors[leaf]) {
                neighbors[neighbor].remove(leaf)
                if (neighbors[neighbor].size == 1)
                    newLeaves.add(neighbor)
            }
        }

        // prepare for the next round
        leaves = newLeaves
    }

    // The remaining nodes are the centroids of the graph
    return leaves
}