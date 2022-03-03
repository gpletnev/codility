package leetcode.challenge.`2020`.`04`.week2

import java.util.*

// https://leetcode.com/problems/backspace-string-compare/
object BackspaceStringCompare {
    fun backspaceCompare(s: String, t: String): Boolean {
        //return build(S) == build(T) // using stack

        var i = s.lastIndex
        var j = t.lastIndex
        var skipS = 0
        var skipT = 0
        while (i >= 0 || j >= 0) {
            while (i >= 0) {
                if (s[i] == '#') {
                    skipS++
                    i--
                } else if (skipS > 0) {
                    skipS--
                    i--
                } else break
            }
            while (j >= 0) {
                if (t[j] == '#') {
                    skipT++
                    j--
                } else if (skipT > 0) {
                    skipT--
                    j--
                } else break
            }

            if (i >= 0 && j >= 0 && s[i] != t[j]) return false

            if (i >= 0 != j >= 0) return false
            i--
            j--
        }
        return true
    }

    fun build(S: String): String {
        val ans: Stack<Char?> = Stack()
        for (c in S.toCharArray()) {
            if (c != '#') ans.push(c) else if (!ans.empty()) ans.pop()
        }
        return ans.toString()
    }
}