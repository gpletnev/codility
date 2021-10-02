package leetcode.challenge.`2021`.`02`.week3

import kotlin.math.pow

// https://leetcode.com/problems/letter-case-permutation/
fun letterCasePermutation(S: String): List<String> {
    val sChars = S.toCharArray()
    val letterIndexes = mutableListOf<Int>()
    for (i in sChars.indices) {
        if (sChars[i].isLetter()) letterIndexes.add(i)
    }

    val bitCount = letterIndexes.size
    val numOfPermutations = 2.toDouble().pow(bitCount).toInt()

    val list = mutableListOf<String>()
    for (i in 0 until numOfPermutations) {
        val bitString = String.format("%12s", i.toString(radix = 2)).replace(' ', '0').reversed()
        val perm = sChars.copyOf()
        for (j in 0 until bitCount) {
            val index = letterIndexes[j]
            val bit = bitString[j]
            perm[index] = if (bit == '1') sChars[index].uppercaseChar() else sChars[index].lowercaseChar()
        }
        list.add(String(perm))
    }
    return list
}