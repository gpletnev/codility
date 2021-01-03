package codility.lessons.lesson2

import java.util.*

// https://app.codility.com/programmers/lessons/2-arrays/cyclic_rotation/
object CyclicRotation {
    fun solution(A: IntArray, K: Int): IntArray {
        val list = A.toList()
        Collections.rotate(list, K)
        return list.toIntArray()
    }

    @JvmStatic
    fun solution2(A: IntArray, K: Int): IntArray {
        if (A.size < 2 || A.size == K) return A
        val shift = K % A.size
        val result = IntArray(A.size)
        System.arraycopy(A, A.size - shift, result, 0, shift)
        System.arraycopy(A, 0, result, shift, A.size - shift)
        return result
    }
}