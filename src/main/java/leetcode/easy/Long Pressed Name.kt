package leetcode.easy

// https://leetcode.com/problems/long-pressed-name/
fun isLongPressedName(name: String, typed: String): Boolean {
    var i = 0
    if (name.last() != typed.last()) return false
    for (c in name) {
        if (i == typed.length) return false

        if (typed[i] != c) {
            if (i == 0 || typed[i - 1] != typed[i]) return false

            val cur: Char = typed[i]
            while (i < typed.length && typed[i] == cur) i++

            if (i == typed.length || typed[i] != c) return false
        }
        i++
    }

    return true
}