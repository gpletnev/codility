package leetcode.challenge.`2020`.`10`.week2

// https://leetcode.com/problems/buddy-strings/
fun buddyStrings(A: String, B: String): Boolean {
    if (A.length != B.length) return false

    val count = IntArray(26)
    if (A == B) {
        for (c in A) {
            count[c - 'a']++
            if (count[c - 'a'] > 1)
                return true
        }
        return false
    }
    val diff: MutableList<Int> = ArrayList()
    for (i in A.indices) {
        if (A[i] != B[i])
            diff.add(i)
        if (diff.size > 2)
            return false
    }
    return diff.size == 2 && A[diff[0]] == B[diff[1]] && A[diff[1]] == B[diff[0]]
}