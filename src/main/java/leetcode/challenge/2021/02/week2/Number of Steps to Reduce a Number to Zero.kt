package leetcode.challenge.`2021`.`02`.week2

// https://leetcode.com/problems/number-of-steps-to-reduce-a-number-to-zero/
fun numberOfSteps(num: Int): Int {
    return if (num != 0) Integer.bitCount(num) + (31 - Integer.numberOfLeadingZeros(num)) else 0
}