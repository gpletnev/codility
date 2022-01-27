package leetcode.challenge.`2021`.`04`.week3

// https://leetcode.com/problems/fibonacci-number/
//fun fib(n: Int): Int { // Binet's formula
//    val goldenRatio = (1 + Math.sqrt(5.0)) / 2
//    return Math.round(Math.pow(goldenRatio, n.toDouble()) / Math.sqrt(5.0)).toInt()
//}

//fun fib(n: Int): Int = fibonacci().elementAt(n)

//fun fibonacci(): Sequence<Int> {
//    // fibonacci terms
//    // 0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, 144, 233, 377, 610, 987, 1597, 2584, 4181, 6765, 10946, ...
//    return generateSequence(Pair(0, 1)) { Pair(it.second, it.first + it.second) }.map { it.first }
//}

fun fib(n: Int): Int = fibonacci(n, 0, 1)

tailrec fun fibonacci(n: Int, a: Int = 0, b: Int = 1): Int =
    when (n) {
        0 -> a
        1 -> b
        else -> fibonacci(n - 1, b, a + b)
    }