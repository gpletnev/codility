package leetcode.challenge.`2020`.`12`

import java.util.*

// https://leetcode.com/problems/largest-rectangle-in-histogram/
fun largestRectangleArea(heights: IntArray): Int {
    var largest = 0
    var current: Int
    val stack: Deque<Int> = LinkedList()
    for (i in 0..heights.size) {
        while (!stack.isEmpty() && (i == heights.size || heights[stack.peek()] >= heights[i])) {
            current = heights[stack.pop()] * if (stack.isEmpty()) i else i - stack.peek() - 1
            largest = Math.max(largest, current)
        }
        stack.push(i)
    }
    return largest
}