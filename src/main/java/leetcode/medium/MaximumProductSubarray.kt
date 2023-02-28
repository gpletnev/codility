package leetcode.medium

// https://leetcode.com/problems/maximum-product-subarray/
fun maxProduct(nums: IntArray): Int {
    var maxProduct = nums[0]
    var min = nums[0]
    var max = nums[0]

    for (i in 1..nums.lastIndex) {
        val num = nums[i]
        min = minOf(min * num, num, num * max).also { max = maxOf(min * num, num, num * max) }

        maxProduct = maxOf(maxProduct, max)
    }

    return maxProduct
}