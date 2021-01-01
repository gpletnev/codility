package leetcode.challenge.`2020`.`06`.week1

import java.util.*

// https://leetcode.com/problems/random-pick-with-weight/
class RandomPickWithWeight(var w: IntArray) {

    private val random = Random()
    val sum: Int

    init {
        for (i in 1..w.lastIndex) {
            w[i] += w[i - 1]
        }
        sum = w[w.lastIndex]
    }

    fun pickIndex(): Int {
        val r = random.nextInt(sum) + 1
        val i = Arrays.binarySearch(w, r)
        return if (i < 0) -i - 1 else i
        //return w.indexOfFirst { r < it }
    }
}