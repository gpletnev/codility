package leetcode.challenge.`2020`.`11`.week4

// https://leetcode.com/problems/unique-morse-code-words/
fun uniqueMorseRepresentations(words: Array<String>): Int {

    val morseAlphabet = arrayOf(".-", "-...", "-.-.", "-..", ".", "..-.", "--.", "....", "..", ".---", "-.-", ".-..", "--", "-.", "---", ".--.", "--.-", ".-.", "...", "-", "..-", "...-", ".--", "-..-", "-.--", "--..")

    val set = mutableSetOf<String>()

    for (word in words) {
        val sb = StringBuilder()
        for (c in word) {
            sb.append(morseAlphabet[c - 'a'])
        }
        set.add(sb.toString())
    }

    return set.size
}