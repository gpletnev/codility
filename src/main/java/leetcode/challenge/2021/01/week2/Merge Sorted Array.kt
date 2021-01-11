package leetcode.challenge.`2021`.`01`.week2

// https://leetcode.com/problems/merge-sorted-array/
fun merge(nums1: IntArray, _m: Int, nums2: IntArray, _n: Int) {
//    nums2.copyInto(nums1, _m)
//    nums1.sort()

    var m = _m - 1
    var n = _n - 1
    var i = _m + _n - 1

    while (m >= 0 || n >= 0) {
        if (n < 0) return

        if (m >= 0 && nums1[m] > nums2[n]) {
            nums1[i] = nums1[m]
            m--
        } else {
            nums1[i] = nums2[n]
            n--
        }
        i--
    }
}