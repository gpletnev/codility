package leetcode.challenge.`2020`.`10`.week3

// https://leetcode.com/problems/rotate-array/
fun rotate(nums: IntArray, k: Int) {
    val shift = k % nums.size
    if (shift == 0) return

    /*        nums.reverse()
            nums.reverse(0, shift)
            nums.reverse(shift, nums.lastIndex + 1)*/

    var count = 0
    var start = 0
    while (count < nums.size) {
        var current = start
        var prev = nums[start]
        do {
            val next = (current + shift) % nums.size
            val temp = nums[next]
            nums[next] = prev
            prev = temp
            current = next
            count++
        } while (start != current)
        start++
    }
}