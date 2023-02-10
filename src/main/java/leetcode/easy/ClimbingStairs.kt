package leetcode.easy

// https://leetcode.com/problems/climbing-stairs/
//fun climbStairs(n: Int): Int {
//    if (n <= 2) return n
//
//    var n2 = 1
//    var n1 = 2
//    var steps = 2
//    repeat(n - 2) {
//        steps = n2 + n1
//        n2 = n1
//        n1 = steps
//    }
//
//    return steps
//}
fun climbStairs(n: Int): Int = climbStairs(n, 1, 2)
tailrec fun climbStairs(n: Int, n1: Int = 1, n2: Int = 2): Int =
    when (n) {
        1 -> n1
        2 -> n2
        else -> climbStairs(n - 1, n2, n1 + n2)
    }