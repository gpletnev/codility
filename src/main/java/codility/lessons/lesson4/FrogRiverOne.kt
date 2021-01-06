package codility.lessons.lesson4

object FrogRiverOne {
    fun solution(X: Int, A: IntArray): Int {
        val path = IntArray(X)
        var pathSum = 0
        for (i in A.indices) {
            if (path[A[i] - 1] == 0) pathSum += 1
            if (pathSum == X) return i
            path[A[i] - 1] = 1
        }
        return -1
    }
}