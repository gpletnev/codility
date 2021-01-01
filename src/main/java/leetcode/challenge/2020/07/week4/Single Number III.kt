package leetcode.challenge.`2020`.`07`.week4

// https://leetcode.com/problems/single-number-iii/
fun singleNumber(nums: IntArray): IntArray {
    var x = 0
    for (n in nums)
        x = x.xor(n)

    // find the most right set bit
    val bit = x.and((x - 1).inv())

    var a = 0
    for (n in nums)
        if (n.and(bit) == bit)
            a = a.xor(n)
    val b = x.xor(a)

    return intArrayOf(a, b)
}