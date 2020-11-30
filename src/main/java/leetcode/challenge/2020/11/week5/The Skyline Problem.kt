package leetcode.challenge.`2020`.`11`.week5

import java.util.*

// https://leetcode.com/problems/the-skyline-problem/
fun getSkyline(buildings: Array<IntArray>): List<List<Int>> {
    val result: MutableList<List<Int>> = ArrayList()
    val height: MutableList<IntArray> = ArrayList()
    for (b in buildings) {
        height.add(intArrayOf(b[0], -b[2]))
        // end point has normal height value
        height.add(intArrayOf(b[1], b[2]))
    }

    // sort $height, based on the first value, if necessary, use the second to break ties
    height.sortWith { a, b ->
        if (a[0] != b[0]) a[0] - b[0] else a[1] - b[1]
    }

    val treeMap = TreeMap<Int, Int>()
    treeMap[0] = 1
    var max = 0
    for (i in height) {
        if (i[1] < 0) {
            treeMap[-i[1]] = (treeMap[-i[1]] ?: 0) + 1
        } else {
            if ((treeMap[i[1]] ?: 0) > 1) {
                treeMap[i[1]] = treeMap[i[1]]!! - 1
            } else {
                treeMap.remove(i[1])
            }
        }
        if (treeMap.lastKey() != max) {
            result.add(listOf(i[0], treeMap.lastKey()))
        }
        max = treeMap.lastKey()
    }
    return result
}