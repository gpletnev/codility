package leetcode.medium

import java.util.*

// https://leetcode.com/problems/network-delay-time/
fun networkDelayTime(times: Array<IntArray>, N: Int, K: Int): Int {
    var max = Int.MIN_VALUE
    val network = HashMap<Int, ArrayList<IntArray>>()
    for (time in times) {
        val to = network.getOrDefault(time[0], ArrayList())
        to.add(intArrayOf(time[1], time[2]))
        network[time[0]] = to
    }
    val que = PriorityQueue<IntArray> { e1, e2 -> e1[1] - e2[1] }
    que.add(intArrayOf(K, 0))
    val reached = HashSet<Int>()
    while (!que.isEmpty()) {
        val toExplore = que.remove()
        if (reached.contains(toExplore[0])) {
            continue
        }
        reached.add(toExplore[0])
        max = maxOf(max, toExplore[1])
        if (!network.containsKey(toExplore[0])) {
            continue
        }
        for (child in network[toExplore[0]]!!) {
            que.add(intArrayOf(child[0], child[1] + toExplore[1]))
        }
    }
    return if (reached.size == N) max else -1
}