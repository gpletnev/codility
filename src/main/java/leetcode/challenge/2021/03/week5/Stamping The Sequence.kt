package leetcode.challenge.`2021`.`03`.week5

import java.util.*
import kotlin.collections.ArrayDeque

// https://leetcode.com/problems/stamping-the-sequence/
fun movesToStamp(stamp: String, target: String): IntArray {
    val M = stamp.length
    val N = target.length
    val queue = ArrayDeque<Int>()
    val done = BooleanArray(N)
    val ans = Stack<Int>()
    val A = mutableListOf<Node>()
    for (i in 0..N - M) {
        // For each window [i, i+M), A[i] will contain
        // info on what needs to change before we can
        // reverse stamp at this window.
        val made = mutableSetOf<Int>()
        val todo = mutableSetOf<Int>()
        for (j in 0 until M) {
            if (target[i + j] == stamp[j]) made.add(i + j) else todo.add(i + j)
        }
        A.add(Node(made, todo))

        // If we can reverse stamp at i immediately,
        // enqueue letters from this window.
        if (todo.isEmpty()) {
            ans.push(i)
            for (j in i until i + M) if (!done[j]) {
                queue.add(j)
                done[j] = true
            }
        }
    }

    // For each enqueued letter (position),
    while (queue.isNotEmpty()) {
        val i = queue.removeFirst()

        // For each window that is potentially affected,
        // j: start of window
        for (j in Math.max(0, i - M + 1)..Math.min(N - M, i)) {
            if (A[j].todo.contains(i)) {  // This window is affected
                A[j].todo.remove(i)
                if (A[j].todo.isEmpty()) {
                    ans.push(j)
                    for (m in A[j].made) if (!done[m]) {
                        queue.add(m)
                        done[m] = true
                    }
                }
            }
        }
    }
    for (b in done) if (!b) return IntArray(0)
    val ret = IntArray(ans.size)
    var t = 0
    while (!ans.isEmpty()) ret[t++] = ans.pop()!!
    return ret
}

class Node(val made: MutableSet<Int>, val todo: MutableSet<Int>)