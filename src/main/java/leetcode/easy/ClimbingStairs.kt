package leetcode.easy

// https://leetcode.com/problems/climbing-stairs/
fun climbStairs(n: Int): Int {
    if (n <= 2) return n

    var n1 = 1
    var n2 = 2
    var steps = 2
    repeat(n - 2) {
        steps = n2 + n1
        n1 = n2
        n2 = steps
    }

    return steps
}