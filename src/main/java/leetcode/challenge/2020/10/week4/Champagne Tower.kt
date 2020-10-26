package leetcode.challenge.`2020`.`10`.week4

fun champagneTower(poured: Int, query_row: Int, query_glass: Int): Double {
    val res = DoubleArray(query_row + 2)
    res[0] = poured.toDouble()
    for (row in 1..query_row)
        for (i in row downTo 0) {
            res[i] = Math.max(0.0, (res[i] - 1) / 2)
            res[i + 1] += res[i]
        }
    return Math.min(res[query_glass], 1.0)
}