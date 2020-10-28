package leetcode.challenge.`2020`.`10`.week4


// https://leetcode.com/problems/summary-ranges/
fun summaryRanges(nums: IntArray): List<String> {
    var start = 0
    var end = 0
    val list = mutableListOf<String>()

    var i = 0
    while (i < nums.size) {
        while (i < nums.lastIndex && nums[i] + 1 == nums[i + 1]) {
            end++
            i++
        }
        if (start == end) {
            list.add(java.lang.String.valueOf(nums[start]))
        } else {
            list.add(nums[start].toString() + "->" + nums[end])
        }
        end++
        start = end
        i++
    }
    return list
}