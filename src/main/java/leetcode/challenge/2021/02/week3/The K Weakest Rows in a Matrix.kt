package leetcode.challenge.`2021`.`02`.week3

import java.util.*

// https://leetcode.com/problems/the-k-weakest-rows-in-a-matrix/
fun kWeakestRows(mat: Array<IntArray>, k: Int): IntArray {
    val priorityQueue = PriorityQueue<Pair<Int, Int>>(k) { a, b ->
        if (a.first != b.first) b.first - a.first else b.second - a.second
    }
    for (i in mat.indices) {
        val sum = mat[i].sum()
        priorityQueue.offer(Pair(sum, i))
        if (priorityQueue.size > k) priorityQueue.poll()
    }

    val result = IntArray(k)
    for (i in k - 1 downTo 0) {
        result[i] = priorityQueue.poll().second
    }
    return result
}