package leetcode.challenge.`2020`.`11`.week4

import java.util.*

// https://leetcode.com/problems/sliding-window-maximum/
fun maxSlidingWindow(nums: IntArray, k: Int): IntArray {
    val maxs = mutableListOf<Int>()

    val q = LinkedList<Int>()
    for (i in nums.indices) {
        // remove numbers out of range k
        while (!q.isEmpty() && q.peek() < i - k + 1) {
            q.poll()
        }
        // remove smaller numbers in k range as they are useless
        while (!q.isEmpty() && nums[q.peekLast()] < nums[i]) {
            q.pollLast()
        }

        q.offer(i)
        if (i >= k - 1) {
            maxs.add(nums[q.peek()])
        }
    }
    return maxs.toIntArray()
}