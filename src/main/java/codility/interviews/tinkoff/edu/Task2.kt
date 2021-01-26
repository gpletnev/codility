package codility.interviews.tinkoff.edu

import kotlin.math.log10


fun main() {
    val (l, r) = readLine()!!.split(" ").map { it.toLong() }
    println(task2(l, r))

}

// count numbers with the same digits l<=num<=r
fun task2(l: Long, r: Long): Long {
    var tmp = 0
    var count = 0L

    val n = log10(r.toDouble()).toInt() + 1

    for (i in 0 until n) {

        tmp = tmp * 10 + 1

        for (j in 1..9) {
            if (tmp * j in l..r) {
                count++
            }
        }
    }
    return count
}