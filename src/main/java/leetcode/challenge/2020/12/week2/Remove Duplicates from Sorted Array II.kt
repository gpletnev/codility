package leetcode.challenge.`2020`.`12`.week2

// https://leetcode.com/problems/remove-duplicates-from-sorted-array-ii/
fun removeDuplicates(nums: IntArray): Int {
    var i = 0
    for (n in nums)
        if (i < 2 || n > nums[i - 2])
            nums[i++] = n
    return i
}