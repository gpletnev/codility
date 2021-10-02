package leetcode.easy.array

// https://leetcode.com/problems/remove-duplicates-from-sorted-array/
fun removeDuplicates(nums: IntArray): Int {
    if (nums.isEmpty()) return 0
    var i = 0
    for (j in 1..nums.lastIndex) {
        if (nums[j] != nums[i]) {
            i++
            nums[i] = nums[j]
        }
    }
    return i + 1
}