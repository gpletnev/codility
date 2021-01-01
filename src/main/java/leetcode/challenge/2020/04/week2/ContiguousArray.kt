package leetcode.challenge.`2020`.`04`.week2

import java.util.*

// https://leetcode.com/problems/contiguous-array/
object ContiguousArray {
    fun findMaxLength(nums: IntArray): Int {
        val map: MutableMap<Int, Int> = HashMap()
        var maxlen = 0
        var count = 0

        for (i in nums.indices) {
            count += if (nums[i] == 1) 1 else -1

            // Array from index 0 to i contains equal number of 0's and 1's
            if (count == 0)
                maxlen = maxOf(maxlen, i + 1)

            if (map.containsKey(count))
                maxlen = maxOf(maxlen, i - map[count]!!)
            else
                map[count] = i
        }

        return maxlen
    }
}