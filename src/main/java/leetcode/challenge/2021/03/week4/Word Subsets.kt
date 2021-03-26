package leetcode.challenge.`2021`.`03`.week4

// https://leetcode.com/problems/word-subsets/
fun wordSubsets(A: Array<String>, B: Array<String>): List<String> {
    val count = IntArray(26)
    var i: Int
    for (b in B) {
        val bCount = counter(b)
        i = 0
        while (i < 26) {
            count[i] = Math.max(count[i], bCount[i])
            ++i
        }
    }
    val res = mutableListOf<String>()
    for (a in A) {
        val aCount = counter(a)
        i = 0
        while (i < 26) {
            if (aCount[i] < count[i]) break
            ++i
        }
        if (i == 26) res.add(a)
    }
    return res
}

fun counter(word: String): IntArray {
    val count = IntArray(26)
    for (c in word.toCharArray()) count[c - 'a']++
    return count
}