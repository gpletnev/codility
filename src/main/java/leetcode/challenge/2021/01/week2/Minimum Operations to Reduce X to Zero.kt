package leetcode.challenge.`2021`.`01`.week2

// https://leetcode.com/problems/minimum-operations-to-reduce-x-to-zero/
fun minOperations(nums: IntArray, x: Int): Int {
    val total = nums.sum() - x
    if (total < 0)
        return -1

    var i = 0
    var j = 0
    var max = Int.MIN_VALUE
    var sum = 0

    while (i < nums.size) {
        while (j < nums.size && sum < total) {
            sum += nums[j]
            j++
        }

        if (sum == total) {
            max = maxOf(max, j - i)
        }

        sum -= nums[i++]
    }

    return if (max == Int.MIN_VALUE) -1 else nums.size - max
}