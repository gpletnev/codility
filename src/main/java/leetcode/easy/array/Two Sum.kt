package leetcode.easy.array

import java.util.*

//  https://leetcode.com/problems/two-sum/
fun twoSum(nums: IntArray, target: Int): IntArray {
    val map = HashMap<Int, Int>()
    for (i in nums.indices) {
        val complement = target - nums[i]
        map[complement]?.let { return intArrayOf(it, i) }
        map[nums[i]] = i
    }
    return intArrayOf()
}