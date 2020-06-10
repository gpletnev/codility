package leetcode.challenge.june2020.week2

import java.util.*

object SearchInsertPosition {
    fun searchInsert(nums: IntArray, target: Int): Int {
        val i = Arrays.binarySearch(nums, target)
        return if (i < 0) -i - 1 else i
    }
}