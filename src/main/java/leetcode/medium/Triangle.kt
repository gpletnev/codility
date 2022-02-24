package leetcode.medium

// https://leetcode.com/problems/triangle/
fun minimumTotal(triangle: List<List<Int>>): Int {
    if (triangle.size == 1) return triangle[0][0]

    var row = triangle.last().toIntArray()
    for (i in triangle.lastIndex - 1 downTo 0) {
        val tempRow = IntArray(row.lastIndex)
        for (j in triangle[i].indices) {
            tempRow[j] = triangle[i][j] + minOf(row[j], row[j + 1])
        }
        row = tempRow
    }

    return row[0]
}