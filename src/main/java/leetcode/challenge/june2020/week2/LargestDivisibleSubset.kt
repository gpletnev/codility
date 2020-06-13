package leetcode.challenge.june2020.week2

import java.util.*

object LargestDivisibleSubset {
    fun largestDivisibleSubset(nums: IntArray): List<Int> {
        if (nums.isEmpty()) return nums.asList()

        val n = nums.size
        val count = IntArray(n) { 1 }
        val pre = IntArray(n) { -1 }
        Arrays.sort(nums)
        var max = 1
        var index = 0
        for (i in 1 until n) {
            for (j in i - 1 downTo 0) {
                if (nums[i] % nums[j] == 0) {
                    if (1 + count[j] > count[i]) {
                        count[i] = count[j] + 1
                        pre[i] = j
                    }
                }
            }
            if (count[i] > max) {
                max = count[i]
                index = i
            }
        }
        val res = ArrayList<Int>()
        while (index != -1) {
            res.add(nums[index])
            index = pre[index]
        }
        return res.sorted()
    }
}