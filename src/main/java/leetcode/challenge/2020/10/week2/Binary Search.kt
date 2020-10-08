package leetcode.challenge.`2020`.`10`.week2

// https://leetcode.com/problems/binary-search/
fun search(nums: IntArray, target: Int): Int {
    var pivot: Int
    var left = 0
    var right: Int = nums.lastIndex
    while (left <= right) {
        pivot = left + (right - left) / 2
        if (nums[pivot] == target) return pivot
        if (target < nums[pivot]) right = pivot - 1 else left = pivot + 1
    }
    return -1
}