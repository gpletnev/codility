package leetcode.challenge.`2021`.`01`.week2

// https://leetcode.com/problems/check-if-two-string-arrays-are-equivalent/
fun arrayStringsAreEqual(word1: Array<String>, word2: Array<String>): Boolean {
    var w1 = 0
    var w2 = 0
    var i1 = 0
    var i2 = 0

    while (w1 < word1.size && w2 < word2.size) {
        if (word1[w1][i1] != word2[w2][i2]) return false

        i1 = ++i1 % word1[w1].length
        i2 = ++i2 % word2[w2].length

        if (i1 == 0) w1++
        if (i2 == 0) w2++
    }
    return w1 == word1.size && w2 == word2.size
    //return word1.joinToString("") == word2.joinToString("")
    //return word1.flatMap { it.toList() } == word2.flatMap { it.toList() }
}