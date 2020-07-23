package leetcode.easy.array

// https://leetcode.com/problems/1-bit-and-2-bit-characters/
fun isOneBitCharacter(bits: IntArray): Boolean {
    var i = 0
    while (i < bits.lastIndex) {
        i += bits[i] + 1
    }
    return i == bits.lastIndex
}
