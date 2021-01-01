package leetcode.challenge.`2020`.`04`.week4

// https://leetcode.com/problems/jump-game/
object JumpGame {
    fun canJump(nums: IntArray): Boolean {
        var goodIndex = nums.lastIndex
        for (i in nums.lastIndex downTo 0) {
            if (i + nums[i] >= goodIndex) {
                goodIndex = i
            }
        }
        return goodIndex == 0

/*        return 0 == nums.foldRightIndexed(nums.lastIndex) { index, item, goodIndex ->
            if (index + item >= goodIndex)
                index
            else goodIndex
        }*/
    }
}