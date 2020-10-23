package leetcode.challenge.`2020`.`10`.week4

// https://leetcode.com/problems/132-pattern/
fun find132pattern(nums: IntArray): Boolean {
    if (nums.size < 3) return false

    val min = IntArray(nums.size)

    min[0] = nums[0]
    for (i in 1..nums.lastIndex)
        min[i] = Math.min(min[i - 1], nums[i])

    var j = nums.lastIndex
    var k = nums.size
    while (j >= 0) {
        if (nums[j] > min[j]) {
            while (k < nums.size && nums[k] <= min[j])
                k++
            if (k < nums.size && nums[k] < nums[j])
                return true
            nums[--k] = nums[j]
        }
        j--
    }

    return false
}