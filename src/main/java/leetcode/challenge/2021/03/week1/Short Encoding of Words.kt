package leetcode.challenge.`2021`.`03`.week1

// https://leetcode.com/problems/short-encoding-of-words/
fun minimumLengthEncoding(words: Array<String>): Int {
    val root = TrieNode()
    val leaves = mutableListOf<TrieNode>()
    for (w in words.toSet()) {
        var cur = root
        for (i in w.lastIndex downTo 0) {
            val j = w[i]
            if (!cur.next.containsKey(j)) cur.next[j] = TrieNode()
            cur = cur.next[j]!!
        }
        cur.depth = w.length + 1
        leaves.add(cur)
    }
    return leaves.fold(0) { acc, leaf -> if (leaf.next.isEmpty()) acc + leaf.depth else acc }
}

internal class TrieNode {
    var next = mutableMapOf<Char, TrieNode>()
    var depth = 0
}