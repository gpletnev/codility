package leetcode.challenge.`2020`.`10`.week5

// https://leetcode.com/problems/maximize-distance-to-closest-person/
fun maxDistToClosest(seats: IntArray): Int {
    var K = 0
    var ans = 0

    for (i in seats.indices) {
        if (seats[i] == 1) {
            K = 0
        } else {
            K++
            ans = Math.max(ans, (K + 1) / 2)
        }
    }

    for (i in seats.indices)
        if (seats[i] == 1) {
            ans = Math.max(ans, i)
            break
        }

    for (i in seats.indices.reversed())
        if (seats[i] == 1) {
            ans = Math.max(ans, seats.lastIndex - i)
            break
        }

    return ans
}