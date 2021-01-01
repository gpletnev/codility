package leetcode.challenge.`2020`.`06`.week4

// https://leetcode.com/problems/single-number-ii/
object SingleNumberII {
    fun singleNumber(nums: IntArray): Int {
        var ans = 0
        for (i in 0..31) {
            var sum = 0
            for (n in nums) {
                if (n shr i and 1 == 1) {
                    sum++
                    sum %= 3
                }
            }
            if (sum != 0) {
                ans = ans or (sum shl i)
            }
        }
        return ans
    }
}