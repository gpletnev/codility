package leetcode.challenge.`2020`.`11`.week2

// https://leetcode.com/problems/valid-square/
fun validSquare(p1: IntArray, p2: IntArray, p3: IntArray, p4: IntArray): Boolean {
    val set = mutableSetOf<Int>()
    set.add(distance(p1, p2))
    set.add(distance(p1, p3))
    set.add(distance(p1, p4))
    set.add(distance(p2, p3))
    set.add(distance(p2, p4))
    set.add(distance(p3, p4))

    return set.size == 2 && !set.contains(0)
}

private fun distance(p1: IntArray, p2: IntArray): Int {
    return (p1[0] - p2[0]) * (p1[0] - p2[0]) + (p1[1] - p2[1]) * (p1[1] - p2[1])
}