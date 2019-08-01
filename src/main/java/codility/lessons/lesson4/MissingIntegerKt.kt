package codility.lessons.lesson4

// O(N) or O(N * log(N))
class MissingIntegerKt {
    companion object {

        fun solution(A: IntArray): Int {
            val map = BooleanArray(A.size + 2)
            A.forEach { if (it > 0 && it <= A.size) map[it] = true }
            for(i in 1..map.size ) {
                if (!map[i]) return i
            }
            return 1
        }
    }
}