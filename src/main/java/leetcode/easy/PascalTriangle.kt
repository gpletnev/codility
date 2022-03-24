package leetcode.easy

// https://leetcode.com/problems/pascals-triangle/
// k cell in n row = n!/k!/(n-k)!
fun generatePascalTriangle(numRows: Int): List<List<Int>> {
    val pt = mutableListOf<List<Int>>()
    pt.add(listOf(1))
    if (numRows < 2) return pt

    for (i in 1 until numRows) {
        val row = IntArray(i + 1) {
            if (it in listOf(0, i)) 1
            else pt[i - 1][it - 1] + pt[i - 1][it]

        }
        pt.add(row.toList())
    }

    return pt
}