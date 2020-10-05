package leetcode.challenge.`2020`.`10`.week1

// https://leetcode.com/problems/complement-of-base-10-integer/
fun bitwiseComplement(N: Int): Int {
/*    val shift = Integer.numberOfLeadingZeros(N) //N.countLeadingZeroBits()
    return if (N == 0) 1 else N.shl(shift).inv().shr(shift)*/

    var comp = 1
    while (comp < N) comp = comp shl 1 or 1
    return N xor comp
}