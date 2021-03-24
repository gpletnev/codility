package leetcode.challenge.`2021`.`03`.week4

import java.util.*

// https://leetcode.com/problems/advantage-shuffle/
fun advantageCount(A: IntArray, B: IntArray): IntArray {
    val m = TreeMap<Int, Int>()
    for (i in A)
        m[i] = m.getOrDefault(i, 0) + 1

    val res = IntArray(A.size)
    for (i in A.indices) {
        var x = m.higherKey(B[i])
        if (x == null) x = m.firstKey()
        m[x] = m[x]!! - 1
        if (m[x] == 0) m.remove(x)
        res[i] = x
    }
    return res
}