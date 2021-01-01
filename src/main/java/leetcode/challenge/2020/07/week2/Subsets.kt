package leetcode.challenge.`2020`.`07`.week2

import java.util.*
import kotlin.math.pow

// https://leetcode.com/problems/subsets/
fun subsets(nums: IntArray): List<List<Int>> {
    val subsets = ArrayList<List<Int>>()
    val n: Int = nums.size

    for (i in 2.0.pow(n).toInt() until 2.0.pow(n + 1).toInt()) {
        // generate bitmask, from 0..00 to 1..11
        val bitmask = Integer.toBinaryString(i).substring(1)

        // append subset corresponding to that bitmask
        val subset = ArrayList<Int>()
        for (j in 0 until n) {
            if (bitmask[j] == '1') subset.add(nums[j])
        }
        subsets.add(subset)
    }
    return subsets
}