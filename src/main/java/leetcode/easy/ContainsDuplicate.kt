package leetcode.easy

// https://leetcode.com/problems/contains-duplicate
fun containsDuplicate(nums: IntArray): Boolean {
//    val set = mutableSetOf<Int>()
//    for(num in nums) {
//        if(!set.add(num)) return true
//    }
//    return false

    nums.sort()
    var prev = nums[0]
    if (nums.size > 1) {
        for (i in 1..nums.lastIndex) {
            if (nums[i] == prev) return true
            prev = nums[i]
        }
    }
    return false
}