package leetcode.challenge.`2021`.`03`.week4

import java.util.*

// https://leetcode.com/problems/vowel-spellchecker/
fun spellchecker(wordlist: Array<String>, queries: Array<String>): Array<String> {
    val words = wordlist.toSet()
    val cap = mutableMapOf<String, String>()
    val vowel = mutableMapOf<String, String>()

    for (w in wordlist) {
        val lower = w.lowercase(Locale.getDefault())
        val devowel = lower.replace("[aeiou]".toRegex(), "#")
        cap.putIfAbsent(lower, w)
        vowel.putIfAbsent(devowel, w)
    }

    for (i in queries.indices) {
        if (words.contains(queries[i])) continue
        val lower = queries[i].lowercase(Locale.getDefault())
        val devowel = lower.replace("[aeiou]".toRegex(), "#")
        queries[i] = when {
            cap.containsKey(lower) -> {
                cap[lower]!!
            }
            vowel.containsKey(devowel) -> {
                vowel[devowel]!!
            }
            else -> {
                ""
            }
        }
    }
    return queries
}