package leetcode.challenge.`2020`.`11`.week1

// https://leetcode.com/problems/find-the-smallest-divisor-given-a-threshold/
fun smallestDivisor(nums: IntArray, threshold: Int): Int {
    nums.sort()
    // binary search
    var left = 1
    var right = nums.last()
    while (left <= right) {
        val pivot = left + (right - left shr 1)
        val num = computeSum(nums, pivot)
        if (num > threshold) {
            left = pivot + 1
        } else {
            right = pivot - 1
        }
    }

    // at the end of loop, left > right,
    // computeSum(right) > threshold
    // computeSum(left) <= threshold
    // --> return left
    return left
}

fun computeSum(nums: IntArray, x: Int): Int {
    var s = 0
    for (n in nums) {
        s += n / x + if (n % x == 0) 0 else 1
    }
    return s
}