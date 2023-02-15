package leetcode.challenge.`2020`.`04`.week2

import java.util.*

// https://leetcode.com/problems/last-stone-weight/
object LastStoneWeight {
    fun lastStoneWeight(stones: IntArray): Int {
        val queue: PriorityQueue<Int> = PriorityQueue<Int>(Collections.reverseOrder())
        stones.forEach {  queue.offer(it) }
        while (queue.isNotEmpty()) {
            val s1 = queue.poll()
            if (queue.isEmpty()) return s1
            val s2 = queue.poll()
            if (s1 - s2 != 0) queue.offer(s1 - s2)
        }
        return 0
    }

/*    fun lastStoneWeight(stones: IntArray): Int {
        stones.sortDescending()
        for (i in 0 until stones.lastIndex) {
            stones[i + 1] = stones[i] - stones[i + 1]
            stones.sortDescending()
        }
        return stones.last()
    }*/
}