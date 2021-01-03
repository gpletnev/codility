package codility.lessons.lesson3

// https://app.codility.com/programmers/lessons/3-time_complexity/tape_equilibrium/
object TapeEquilibrium {
    fun solution(A: IntArray): Int {
        val sum = A.sum()
        var firstPartSum = A[0]
        var secondPartSum = sum - A[0]
        var minDifference = Math.abs(firstPartSum - secondPartSum)
        for (P in 1 until A.size - 1) {
            firstPartSum += A[P]
            secondPartSum -= A[P]
            val difference = Math.abs(firstPartSum - secondPartSum)
            if (difference < minDifference) {
                minDifference = difference
            }
        }
        return minDifference
    }
}