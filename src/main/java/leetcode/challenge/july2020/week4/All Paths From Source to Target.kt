package leetcode.challenge.july2020.week4

// https://leetcode.com/problems/all-paths-from-source-to-target/
fun allPathsSourceTarget(graph: Array<IntArray>): List<List<Int>> {
    val result = ArrayList<ArrayList<Int>>()
    allPathsSourceTarget(graph, 0, graph.lastIndex, ArrayList<Int>(), result)
    return result
}

fun allPathsSourceTarget(graph: Array<IntArray>, source: Int, target: Int, path: ArrayList<Int>, result: ArrayList<ArrayList<Int>>) {
    path.add(source)
    if (source == target) {
        result.add(path)
        return
    }

    for (node in graph[source]) {
        val nextPath = path.toMutableList()
        allPathsSourceTarget(graph, node, target, nextPath as ArrayList<Int>, result)
    }
}