package leetcode.medium

import java.util.*

// https://leetcode.com/problems/course-schedule-ii/
fun findOrder(numCourses: Int, prerequisites: Array<IntArray>): IntArray {
    val indegrees = IntArray(numCourses) { 0 }

    val graph = List(numCourses) { mutableListOf<Int>() }
    for ((cur, prev) in prerequisites) {
        graph[prev].add(cur)
        ++indegrees[cur]
    }

    val queue = LinkedList<Int>()
    for ((idx, indegree) in indegrees.withIndex()) {
        if (indegree == 0) {
            queue.offer(idx)
        }
    }

    val ans = IntArray(numCourses) { 0 }
    var idx = 0

    while (queue.isNotEmpty()) {
        val cur = queue.poll()
        ans[idx++] = cur

        for (pre in graph[cur]) {
            if (--indegrees[pre] == 0) {
                queue.offer(pre)
            }
        }
    }

    if (idx < numCourses)
        return intArrayOf()

    return ans
}