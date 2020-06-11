package leetcode.challenge.june2020.week2

// https://leetcode.com/problems/sort-colors/
object SortColors {
    fun sortColors(nums: IntArray) {
        //nums.sort()
        var zeroIndex = 0
        var twoIndex = nums.lastIndex
        var i = 0
        while (i <= twoIndex) {
            when {
                nums[i] == 0 -> nums.swap(zeroIndex++, i++)
                nums[i] == 2 -> nums.swap(twoIndex--, i)
                else -> i++
            }
        }
    }

    fun IntArray.swap(i: Int, j: Int) {
        this[i] = this[j].also { this[j] = this[i] }
    }
}