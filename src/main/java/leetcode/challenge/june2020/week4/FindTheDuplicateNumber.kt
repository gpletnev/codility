package leetcode.challenge.june2020.week4

// https://leetcode.com/problems/find-the-duplicate-number/
object FindTheDuplicateNumber {
    fun findDuplicate(nums: IntArray): Int {
        // Find the intersection point of the two runners.
        var slow = nums[0]
        var fast = nums[0]
        do {
            slow = nums[slow]
            fast = nums[nums[fast]]
        } while (slow != fast)

        // Find the "entrance" to the cycle.
        slow = nums[0]
        while (slow != fast) {
            slow = nums[slow]
            fast = nums[fast]
        }

        return fast
    }
}