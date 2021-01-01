package leetcode.challenge.`2020`.`05`.week3

object MaximumSumCircularSubarray {
    fun maxSubarraySumCircular(A: IntArray): Int {
        var total = 0
        var localMax = 0
        var localMin = 0
        var globalMax = Int.MIN_VALUE
        var globalMin = Int.MAX_VALUE

        for (n in A) {
            total += n

            localMax = Integer.max(n, n + localMax)
            if (localMax > globalMax)
                globalMax = localMax

            localMin = Integer.min(n, n + localMin)
            if (localMin < globalMin)
                globalMin = localMin
        }

        return if (globalMax < 0) globalMax else Integer.max(globalMax, total - globalMin)
    }
}