package leetcode.challenge.`2021`.`01`.week3

// https://leetcode.com/problems/get-maximum-in-generated-array/
fun getMaximumGenerated(n: Int): Int {
    if (n == 0) return 0

    val nums = IntArray(n + 1)
    nums[1] = 1
    var max = nums[1]
    for (i in 1..(n / 2)) {
        if (2 * i <= n) {
            nums[2 * i] = nums[i]
        }
        if (2 * i + 1 <= n) {
            nums[2 * i + 1] = nums[i] + nums[i + 1]
            max = maxOf(nums[2 * i + 1], max)
        }
    }
    return max
}