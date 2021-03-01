package leetcode.challenge.`2021`.`02`.week4

import java.util.*

// https://leetcode.com/problems/maximum-frequency-stack/
class FreqStack {
    var freq = HashMap<Int, Int>()
    var map = HashMap<Int, Stack<Int>>()
    var maxfreq = 0
    fun push(x: Int) {
        val f = freq.getOrDefault(x, 0) + 1
        freq[x] = f
        maxfreq = maxOf(maxfreq, f)
        if (!map.containsKey(f)) map[f] = Stack()
        map[f]!!.add(x)
    }

    fun pop(): Int {
        val x = map[maxfreq]!!.pop()
        freq[x] = maxfreq - 1
        if (map[maxfreq]!!.size == 0) maxfreq--
        return x
    }
}