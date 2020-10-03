package leetcode.challenge.`2020`.`10`.week1

import java.util.*

// https://leetcode.com/problems/k-diff-pairs-in-an-array/
fun findPairs(nums: IntArray, k: Int): Int {
    if (nums.size <= 1) return 0

    Arrays.sort(nums)
    var start = 0
    var end = 0
    var count = 0

    while (start < nums.size && end < nums.size) {
        if (start == end || nums[start] + k > nums[end]) end++
        else if (nums[start] + k < nums[end]) start++
        else {
            count++
            start++
            while (end < nums.size - 1 && nums[end] == nums[end + 1]) end++
            end++
        }
    }
    return count
}