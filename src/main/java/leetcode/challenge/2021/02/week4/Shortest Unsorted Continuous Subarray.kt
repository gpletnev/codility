package leetcode.challenge.`2021`.`02`.week4

// https://leetcode.com/problems/shortest-unsorted-continuous-subarray/
fun findUnsortedSubarray(nums: IntArray): Int {
/*    val snums = nums.clone()
    snums.sort()
    var start = snums.size
    var end = 0
    for (i in snums.indices) {
        if (snums[i] != nums[i]) {
            start = minOf(start, i)
            end = maxOf(end, i)
        }
    }
    return if (end - start >= 0) end - start + 1 else 0*/

    val n = nums.size
    var start = -1
    var end = -2
    var min = nums.last()
    var max = nums.first()
    for (i in 1 until n) {
        max = maxOf(max, nums[i])
        min = minOf(min, nums[n - 1 - i])
        if (nums[i] < max) end = i
        if (nums[n - 1 - i] > min) start = n - 1 - i
    }
    return end - start + 1
}