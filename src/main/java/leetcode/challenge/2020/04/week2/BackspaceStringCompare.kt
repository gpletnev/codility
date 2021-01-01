package leetcode.challenge.`2020`.`04`.week2

import java.util.*

// https://leetcode.com/problems/backspace-string-compare/
object BackspaceStringCompare {
    fun backspaceCompare(S: String, T: String): Boolean {
        //return build(S) == build(T) // using stack

        var i = S.length - 1
        var j = T.length - 1
        var skipS = 0
        var skipT = 0
        while (i >= 0 || j >= 0) {
            while (i >= 0) {
                if (S[i] == '#') {
                    skipS++
                    i--
                } else if (skipS > 0) {
                    skipS--
                    i--
                } else break
            }
            while (j >= 0) {
                if (T[j] == '#') {
                    skipT++
                    j--
                } else if (skipT > 0) {
                    skipT--
                    j--
                } else break
            }

            if (i >= 0 && j >= 0 && S[i] != T[j]) return false

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