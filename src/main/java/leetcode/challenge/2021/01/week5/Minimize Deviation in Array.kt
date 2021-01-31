package leetcode.challenge.`2021`.`01`.week5

import java.util.*

// https://leetcode.com/problems/minimize-deviation-in-array/
fun minimumDeviation(nums: IntArray): Int {
    val s = TreeSet<Int>()
    for (i in nums) {
        s.add(i)
    }

    var min = s.last() - s.first()

    while (s.first() % 2 != 0) {
        s.add(s.pollFirst()!! * 2)
        min = minOf(min, s.last() - s.first())
    }

    while (s.last() % 2 == 0) {
        s.add(s.pollLast()!! / 2)
        min = minOf(min, s.last() - s.first())
    }

    return min
}