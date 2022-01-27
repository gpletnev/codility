package leetcode.challenge.`2020`.`06`.week2

import java.util.*

// https://leetcode.com/problems/search-insert-position/
object SearchInsertPosition {
//    fun searchInsert(nums: IntArray, target: Int): Int  = nums.binarySearch(target).let {
//            if (it < 0) -it - 1 else it
//        }
//    }

    fun searchInsert(nums: IntArray, target: Int): Int {
        val i = Arrays.binarySearch(nums, target)
        return if (i < 0) -i - 1 else i
    }
}