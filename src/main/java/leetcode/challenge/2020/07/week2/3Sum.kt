package leetcode.challenge.`2020`.`07`.week2

// https://leetcode.com/problems/3sum/
fun threeSum(nums: IntArray): List<List<Int>> {
    val target = 0
    val result = mutableListOf<List<Int>>()

    if (nums.size < 3) return result

    nums.sort()

    // l - left
    // m - middle
    // r - right
    for (l in 0..(nums.lastIndex - 2)) {
        if (nums[l] > target) break

        if (l > 0 && nums[l] == nums[l - 1]) continue

        var m = l + 1
        var r = nums.lastIndex
        while (m < r) {
            val sum = nums[l] + nums[m] + nums[r]
            when {
                sum == target -> {
                    result.add(listOf(nums[l], nums[m], nums[r]))

                    while (m < r && nums[m] == nums[m + 1]) m++
                    while (m < r && nums[r] == nums[r - 1]) r--

                    m++
                    r--
                }
                sum < target -> {
                    m++
                }
                else -> {
                    r--
                }
            }
        }
    }
    return result
}
