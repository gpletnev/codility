package leetcode.hard.array

// https://leetcode.com/problems/median-of-two-sorted-arrays/
fun findMedianSortedArrays(nums1: IntArray, nums2: IntArray): Double {
    val nums = IntArray(nums1.size + nums2.size)
    nums1.copyInto(nums, 0)
    nums2.copyInto(nums, nums1.size)
    nums.sort()

    return if (nums.size % 2 == 0)
        (nums[(nums1.size + nums2.size) / 2 - 1] + nums[(nums1.size + nums2.size) / 2]).toDouble() / 2
    else nums[(nums1.size + nums2.size) / 2].toDouble()
}