package leetcode.challenge.`2021`.`04`.week1

// https://leetcode.com/problems/determine-if-string-halves-are-alike/
fun halvesAreAlike(s: String): Boolean {
    return s.subSequence(0, s.length / 2).count { it.isVowel() } == s.subSequence(s.length / 2, s.length)
        .count { it.isVowel() }
}

fun Char.isVowel() = this in setOf('a', 'e', 'i', 'o', 'u', 'A', 'E', 'I', 'O', 'U')

