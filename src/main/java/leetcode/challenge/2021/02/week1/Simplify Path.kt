package leetcode.challenge.`2021`.`02`.week1

import java.util.*

// https://leetcode.com/problems/simplify-path/
fun simplifyPath(path: String): String {
    val stack: Deque<String> = LinkedList()
    val skip: Set<String> = setOf("..", ".", "")
    for (dir in path.split("/").toTypedArray()) {
        if (dir == ".." && !stack.isEmpty()) stack.pop() else if (!skip.contains(dir)) stack.push(dir)
    }
    var res = ""
    for (dir in stack) res = "/$dir$res"
    return if (res.isEmpty()) "/" else res
}