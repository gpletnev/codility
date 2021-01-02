package codility.lessons.lesson2

import java.util.*

object OddOccurrencesInArray {
    @JvmStatic
    fun solution(A: IntArray): Int {
        return A.reduce { res, i -> res.xor(i) }
    }

    @JvmStatic
    fun <T> solutionT(A: Array<T>): T? {
        var result: T? = null
        val map = HashMap<T, Boolean>()
        for (i in A) {
            if (map.containsKey(i)) {
                map.remove(i)
            } else {
                map[i] = true
            }
        }
        if (map.keys.size > 0) {
            result = map.keys.iterator().next()
        }
        return result
    }
}