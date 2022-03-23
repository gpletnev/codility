package leetcode.easy.array

// https://leetcode.com/problems/intersection-of-two-arrays-ii/
fun intersect(nums1: IntArray, nums2: IntArray): IntArray {
    nums1.sort()
    nums2.sort()
    var i = 0
    var j = 0
    val list = mutableListOf<Int>()
    while (i < nums1.size && j < nums2.size) {
        when {
            nums1[i] > nums2[j] -> {
                j++
            }
            nums1[i] < nums2[j] -> {
                i++
            }
            else -> {
                list.add(nums1[i])
                i++
                j++
            }
        }
    }
    return list.toIntArray()
}