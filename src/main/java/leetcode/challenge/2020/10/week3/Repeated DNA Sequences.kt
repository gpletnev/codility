package leetcode.challenge.`2020`.`10`.week3

// https://leetcode.com/problems/repeated-dna-sequences/
fun findRepeatedDnaSequences(s: String): List<String> {
    val seen = hashSetOf<String>()
    val result = hashSetOf<String>()

    var i = 0
    while (i + 10 <= s.lastIndex + 1) {
        val decet = s.substring(i, i + 10)
        if (!seen.add(decet))
            result.add(decet)
        i++
    }

    return result.toList()
}