package leetcode.challenge.april2020.week2

// https://leetcode.com/problems/last-stone-weight/
object LastStoneWeight {
/*    fun lastStoneWeight(stones: IntArray): Int {
        val queue: PriorityQueue<Int> = PriorityQueue<Int>(Collections.reverseOrder())
        for (s in stones.reversed()) queue.add(s)
        while (queue.size != 0) {
            val s1 = queue.poll()
            if (queue.size == 0) return s1
            val s2 = queue.poll()
            if (s1 - s2 != 0) queue.add(s1 - s2)
        }
        return 0
    }*/

    fun lastStoneWeight(stones: IntArray): Int {
        stones.sort()
        for (i in stones.lastIndex downTo 1) {
            stones[i - 1] = stones[i] - stones[i - 1]
            stones.sort(0, i)
        }
        return stones[0]
    }
}