package leetcode.medium

import java.util.*
import kotlin.collections.ArrayList
import kotlin.collections.HashMap
import kotlin.properties.Delegates

// https://leetcode.com/problems/word-ladder/
object WordLadder {
    private var L by Delegates.notNull<Int>()
    private lateinit var allComboDict: MutableMap<String, ArrayList<String>>

    private fun visitWordNode(
            queue: Queue<Pair<String, Int>>,
            startMap: MutableMap<String, Int>,
            endMap: MutableMap<String, Int>): Int {
        val node = queue.remove()
        val word: String = node.first
        val level: Int = node.second
        for (i in 0 until L) {

            // Intermediate words for current word
            val newWord = "${word.substring(0, i)}*${word.substring(i + 1, L)}"

            // Next states are all the words which share the same intermediate state.
            for (adjacentWord in allComboDict.getOrDefault(newWord, ArrayList())) {
                // If at any point if we find what we are looking for
                // i.e. the end word - we can return with the answer.
                if (endMap.containsKey(adjacentWord)) {
                    return level + endMap[adjacentWord]!!
                }
                if (!startMap.containsKey(adjacentWord)) {

                    // Save the level as the value of the dictionary, to save number of hops.
                    startMap[adjacentWord] = level + 1
                    queue.add(Pair(adjacentWord, level + 1))
                }
            }
        }
        return -1
    }

    fun ladderLength(beginWord: String, endWord: String, wordList: List<String>): Int {
        if (!wordList.contains(endWord)) {
            return 0
        }

        allComboDict = HashMap()
        // Since all words are of same length.
        L = beginWord.length
        for (word in wordList) {
            for (i in 0 until L) {
                // Key is the generic word
                // Value is a list of words which have the same intermediate generic word.
                val newWord = "${word.substring(0, i)}*${word.substring(i + 1, L)}"
                val transformations = allComboDict.getOrDefault(newWord, ArrayList())
                transformations.add(word)
                allComboDict[newWord] = transformations
            }
        }

        // Queues for bidirectional BFS
        // BFS starting from beginWord
        val beginQueue: Queue<Pair<String, Int>> = LinkedList()

        // BFS starting from endWord
        val endQueue: Queue<Pair<String, Int>> = LinkedList()
        beginQueue.add(Pair(beginWord, 1))
        endQueue.add(Pair(endWord, 1))

        // Visited to make sure we don't repeat processing same word.
        val visitedBegin: MutableMap<String, Int> = HashMap()
        val visitedEnd: MutableMap<String, Int> = HashMap()
        visitedBegin[beginWord] = 1
        visitedEnd[endWord] = 1
        while (!beginQueue.isEmpty() && !endQueue.isEmpty()) {

            // One hop from begin word
            var ans = visitWordNode(beginQueue, visitedBegin, visitedEnd)
            if (ans > -1) {
                return ans
            }

            // One hop from end word
            ans = visitWordNode(endQueue, visitedEnd, visitedBegin)
            if (ans > -1) {
                return ans
            }
        }
        return 0
    }
}
