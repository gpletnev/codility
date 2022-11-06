package leetcode.challenge.`2021`.`02`.week1

// https://leetcode.com/problems/longest-harmonious-subsequence/
fun findLHS(nums: IntArray): Int {
    val map = HashMap<Int, Int>()
    var res = 0
    for (num in nums) {
        map[num] = map.getOrDefault(num, 0) + 1
        if (map.containsKey(num + 1)) res = maxOf(res, map[num]!! + map[num + 1]!!)
        if (map.containsKey(num - 1)) res = maxOf(res, map[num]!! + map[num - 1]!!)
    }
    return res
}