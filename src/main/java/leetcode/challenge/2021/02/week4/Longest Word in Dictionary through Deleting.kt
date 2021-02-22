package leetcode.challenge.`2021`.`02`.week4

// https://leetcode.com/problems/longest-word-in-dictionary-through-deleting/
fun findLongestWord(s: String, d: List<String>): String {
    var longest = ""
    for (word in d) {
        var i = 0
        for (c in s)
            if (i < word.length && c == word[i])
                i++
        if (i == word.length && word.length >= longest.length)
            if (word.length > longest.length || word < longest)
                longest = word
    }
    return longest
}