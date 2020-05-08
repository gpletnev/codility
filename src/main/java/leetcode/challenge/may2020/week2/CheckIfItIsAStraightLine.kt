package leetcode.challenge.may2020.week2

// https://leetcode.com/problems/check-if-it-is-a-straight-line/
object CheckIfItIsAStraightLine {
    // y = a*x + b
    fun checkStraightLine(coordinates: Array<IntArray>): Boolean {
        if (coordinates.size == 2)
            return true
        val x0 = coordinates[0][0]
        val y0 = coordinates[0][1]
        val x1 = coordinates[1][0]
        val y1 = coordinates[1][1]

        if (x0 - x1 == 0) {
            for (i in 2..coordinates.lastIndex) {
                val x = coordinates[i][0]

                if (x != x0) return false
            }
            return true
        }

        val a = (y0 - y1) / (x0 - x1)
        val b = y1 - a * x1
        for (i in 2..coordinates.lastIndex) {
            val x = coordinates[i][0]
            val y = coordinates[i][1]

            if (y != a * x + b) return false
        }

        return true
    }
}