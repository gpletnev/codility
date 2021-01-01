package leetcode.challenge.`2021`.`01`.week1

// https://leetcode.com/problems/check-array-formation-through-concatenation/
fun canFormArray(arr: IntArray, pieces: Array<IntArray>): Boolean {
    val map = mutableMapOf<Int, Int>()
    for (i in arr.indices) map[arr[i]] = i
    for (piece in pieces) {
        if (!map.containsKey(piece[0])) return false
        for (i in 0 until piece.lastIndex)
            if (map.getOrDefault(piece[i], Int.MIN_VALUE) + 1 != map.getOrDefault(piece[i + 1], Int.MIN_VALUE))
                return false
    }
    return true
}