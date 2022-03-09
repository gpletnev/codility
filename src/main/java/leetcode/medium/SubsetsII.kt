package leetcode.medium

// https://leetcode.com/problems/subsets-ii/
fun subsetsWithDup(nums: IntArray): List<List<Int>> {
    nums.sort()

    val result = mutableListOf<List<Int>>()
    result.add(listOf())

    var cashedSize = 0
    var start: Int
    for (i in nums.indices) {
        val subsets = mutableListOf<List<Int>>()
        start = if (i > 0 && nums[i - 1] == nums[i]) cashedSize else 0
        cashedSize = result.size
        for (j in start..result.lastIndex) {
            val subset = result[j].toMutableList()
            subset.add(nums[i])
            subsets.add(subset)
        }
        result.addAll(subsets)
    }
    return result
}