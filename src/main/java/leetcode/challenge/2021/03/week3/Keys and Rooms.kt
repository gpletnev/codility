package leetcode.challenge.`2021`.`03`.week3

import java.util.*

// https://leetcode.com/problems/keys-and-rooms/
fun canVisitAllRooms(rooms: List<List<Int>>): Boolean {
    val dfs = Stack<Int>()
    dfs.add(0)
    val seen = mutableSetOf<Int>()
    seen.add(0)
    while (dfs.isNotEmpty()) {
        val i = dfs.pop()
        for (j in rooms[i]) if (!seen.contains(j)) {
            dfs.add(j)
            seen.add(j)
            if (rooms.size == seen.size) return true
        }
    }
    return rooms.size == seen.size
}