package leetcode.challenge.`2020`.`12`.week3

// https://leetcode.com/problems/increasing-triplet-subsequence/
fun increasingTriplet(nums: IntArray): Boolean {
    var first = Int.MAX_VALUE
    var second = Int.MAX_VALUE

    for (n in nums) {
        when {
            n <= first -> {
                first = n
            }
            n <= second -> {
                second = n
            }
            else -> {
                return true
            }
        }
    }
    return false
}