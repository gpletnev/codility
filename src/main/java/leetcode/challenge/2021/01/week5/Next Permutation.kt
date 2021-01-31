package leetcode.challenge.`2021`.`01`.week5

// https://leetcode.com/problems/next-permutation/
fun nextPermutation(nums: IntArray) {
    var i = nums.size - 2
    while (i >= 0 && nums[i + 1] <= nums[i]) i--

    if (i >= 0) {
        var j = nums.lastIndex
        while (j >= i + 1 && nums[i] >= nums[j]) j--
        nums[i] = nums[j].also { nums[j] = nums[i] }
    }

    var l = i + 1
    var r = nums.lastIndex
    while (l < r) {
        nums[l] = nums[r].also { nums[r] = nums[l] }
        l++
        r--
    }
}