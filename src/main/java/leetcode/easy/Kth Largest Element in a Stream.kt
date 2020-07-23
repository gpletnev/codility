package leetcode.easy

import java.util.*

// https://leetcode.com/problems/kth-largest-element-in-a-stream/
class KthLargest(val k: Int, nums: IntArray) {

    private val pq = PriorityQueue<Int>(k)

    init {
        for (n in nums) {
            add(n)
        }
    }

    fun add(`val`: Int): Int {
        if (pq.size < k) {
            pq.offer(`val`)
        } else if (pq.peek() < `val`) {
            pq.poll()
            pq.offer(`val`)
        }
        return pq.peek()
    }
}