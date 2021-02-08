package leetcode.challenge.`2021`.`02`.week2

// https://leetcode.com/problems/peeking-iterator/
class PeekingIterator(val iterator: Iterator<Int?>) : Iterator<Int?> {
    private var hasPeeked = false
    private var peekedElement: Int? = null

    fun peek(): Int? {
        if (!hasPeeked) {
            peekedElement = iterator.next()
            hasPeeked = true
        }
        return peekedElement
    }

    override fun next(): Int? {
        if (!hasPeeked) {
            return iterator.next()
        }
        val result = peekedElement
        hasPeeked = false
        peekedElement = null
        return result
    }

    override fun hasNext(): Boolean {
        return hasPeeked || iterator.hasNext()
    }
}