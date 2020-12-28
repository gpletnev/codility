package leetcode.challenge.`2020`.`12`.week4

// https://leetcode.com/problems/reach-a-number/
fun reachNumber(target: Int): Int {
    val t = Math.abs(target)
    val n = Math.ceil((Math.sqrt(8.0 * t + 1) - 1) / 2).toInt()
    val d = n * (n + 1) / 2 - t
    return when {
        d % 2 == 0 -> n
        (d + n + 1) % 2 == 0 -> n + 1
        else -> n + 2
    }
}