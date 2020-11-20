package leetcode.challenge.`2020`.`11`.week3

// https://leetcode.com/problems/search-in-rotated-sorted-array-ii/
fun search(nums: IntArray, target: Int): Boolean {
    if (nums.isEmpty()) return false
    if (nums.last() == target) return true

    for (i in 0 until nums.lastIndex) {
        when {
            nums[i] == target -> return true
            nums[i] < target && target < nums[i + 1] -> return false
        }
    }

    return false
}