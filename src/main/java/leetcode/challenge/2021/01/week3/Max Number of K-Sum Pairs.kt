package leetcode.challenge.`2021`.`01`.week3

// https://leetcode.com/problems/max-number-of-k-sum-pairs/
fun maxOperations(nums: IntArray, k: Int): Int {
    val map = mutableMapOf<Int, Int>()
    var count = 0
    for (i in nums.indices) {
        if (map.getOrDefault(k - nums[i], 0) > 0) {
            val newValue = map.getOrDefault(k - nums[i], 0) - 1
            if (newValue > 0) {
                map[k - nums[i]] = newValue
            } else {
                map.remove(k - nums[i])
            }
            count++
        } else {
            map[nums[i]] = map.getOrDefault(nums[i], 0) + 1
        }
    }
    return count
}