package leetcode.medium

// https://leetcode.com/problems/two-sum-ii-input-array-is-sorted/
fun twoSumII(numbers: IntArray, target: Int): IntArray {
    var l = 0
    var r = numbers.lastIndex

    while (l < r) {
        val sum = numbers[l] + numbers[r]
        when {
            sum < target -> l++

            sum > target -> r--

            else -> return intArrayOf(l + 1, r + 1)

        }
    }

    return intArrayOf()
}