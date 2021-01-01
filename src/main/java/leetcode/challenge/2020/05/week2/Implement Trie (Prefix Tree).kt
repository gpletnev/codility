package leetcode.challenge.`2020`.`05`.week2


class Trie {

    internal class TrieNode {
        // R links to node children
        private val links: Array<TrieNode?>
        private val R = 26
        var isEnd = false

        fun containsKey(ch: Char): Boolean {
            return links[ch - 'a'] != null
        }

        operator fun get(ch: Char): TrieNode? {
            return links[ch - 'a']
        }

        fun put(ch: Char, node: TrieNode?) {
            links[ch - 'a'] = node
        }

        init {
            links = arrayOfNulls(R)
        }
    }

    private val root: TrieNode = TrieNode()

    /** Inserts a word into the trie. */
    fun insert(word: String) {
        var node = root
        for (c in word) {
            if (!node.containsKey(c)) {
                node.put(c, TrieNode())
            }
            node = node[c]!!
        }
        node.isEnd = true

    }

    /** Search a prefix or whole key in trie and returns the node where search ends */
    private fun searchPrefix(word: String): TrieNode? {
        var node: TrieNode? = root
        for (c in word) {
            node = if (node!!.containsKey(c)) {
                node[c]
            } else {
                return null
            }
        }
        return node
    }

    /** Returns if the word is in the trie. */
    fun search(word: String): Boolean {
        val node = searchPrefix(word)
        return node != null && node.isEnd
    }

    /** Returns if there is any word in the trie that starts with the given prefix. */
    fun startsWith(prefix: String): Boolean {
        val node = searchPrefix(prefix)
        return node != null
    }
}

