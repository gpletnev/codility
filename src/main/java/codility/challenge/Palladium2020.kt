package codility.challenge

class Palladium2020 {
    companion object {
        fun solution(H: IntArray): Int {
            val N = H.size

            var max = 0
            val maxFromLeft = Array<Int>(N + 1) { 0 }
            for (i in H.indices) {
                max = maxOf(max, H[i])
                maxFromLeft[i + 1] = max
            }

            val maxFromRight = Array<Int>(N + 1) { 0 }
            max = 0
            for (i in H.lastIndex downTo 0) {
                max = maxOf(max, H[i])
                maxFromRight[i] = max
            }

            var result: Int = Int.MAX_VALUE
            for (i in 0..N)
                result = minOf(result, maxFromLeft[i] * i + maxFromRight[i] * (N - i))
            return result
        }
    }
}