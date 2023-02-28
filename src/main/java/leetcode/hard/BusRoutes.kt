package leetcode.hard

import java.util.LinkedList

// https://leetcode.com/problems/bus-routes/
fun numBusesToDestination(routes: Array<IntArray>, source: Int, target: Int): Int {
    val map = mutableMapOf<Int, MutableList<Int>>()
    routes.forEachIndexed {bus, route ->
        route.forEach { stops ->
            map.getOrPut(stops) { mutableListOf() } += bus
        }
    }

    val visitedStops = mutableSetOf<Int>()
    val visitedRoutes = mutableSetOf<Int>()
    val q = LinkedList<Pair<Int, Int>>()
    q += source to 0

    while (q.isNotEmpty()) {
        val (stop, count) = q.poll()

        if (stop == target) return count
        if (stop in visitedStops) continue

        visitedStops += stop
        for (r in map[stop]!!) {
            if (r in visitedRoutes) continue
            for (s in routes[r]) {
                if (s in visitedStops) continue
                q += s to count + 1
                visitedRoutes += r
            }
        }
    }

    return -1
}
